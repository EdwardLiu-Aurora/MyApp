import java.util.*;

// 算数题目生成
public class ExerciseGenerator {
    /**
     * 数值范围
     */
    private int range;
    /**
     * 题目数量
     */
    private int number;
    /**
     * 随机数种子，用于生成各种随机选项
     */
    private Random random = new Random(System.currentTimeMillis());
    /**
     * 验证重复使用的哈希集合
     */
    private Set<String> duplicateCheckSet = new HashSet<>();
    /**
     * 存储答案使用的哈希映射表 <算式, 答案>
     */
    private HashMap<String, String> resultMap = new HashMap<>();

    public ExerciseGenerator(){}
    public ExerciseGenerator(int range, int number){
        if(range < 2) throw new IllegalArgumentException("数值的范围不能小于 2 ");
        if(number < 1) throw new IllegalArgumentException("题目的数量不能小于 1 ");
        this.range = range;
        this.number = number;
    }

    /**
     * 生成算术式和答案的类
     * @return 当对应 range 可以生成 number 个算术式时，返回表达式和答案；否则返回 null
     */
    public HashMap<String,String> generateExp() {
        if(number > 1000*(range-1)*(range-1)) return null;
        duplicateCheckSet = new HashSet<>();
        resultMap = new HashMap<>();
        int allo = 0;
        String[] answer;
        while(duplicateCheckSet.size() < number) {
            allo = random.nextInt(101);
            if(allo <= 1) answer = oneOpGenerator();
            else if(allo <= 10) answer = twoOpGenerator();
            else if(allo <= 55) answer = threeOpGeneratorA();
            else answer = threeOpGeneratorB();
            if(duplicateCheck(answer[0])) resultMap.put(answer[1], answer[2]);
        }
        return resultMap;
    }

    public boolean duplicateCheck(String expression) {
        if(duplicateCheckSet.contains(expression)) return false;
        duplicateCheckSet.add(expression);
        return true;
    }

    /**
     * 数值生成器
     *
     * @return 分数对象
     */
    public Fraction fractionGenerator() {
        if(range < 1) throw new IllegalArgumentException("数值的范围不能小于 1 ");
        // 分母范围为 1 - range, 不包含 range
        int denominator = random.nextInt(range - 1) + 1;
        int numerator = 0;
        // 分子范围为 0 - range ^ 2, 不包含 range ^ 2
        numerator = random.nextInt(denominator * denominator + 1);
        return new Fraction(numerator, denominator);
    }

    /**
     * 算子生成器
     * @return + - × ÷ 中的任一一个运算符
     */
    public char opGenerator() {
        char result;
        switch(random.nextInt(4)) {
            case 0:
                result = '+';
                break;
            case 1:
                result = '-';
                break;
            case 2:
                result = '×';
                break;
            case 3:
                result = '÷';
                break;
            default:
                result = '+';
        }
        return result;
    }

    /**
     * 单算子算术式生成器
     * @return 字符串数组，[0]放置化简的查重字符串，[1]放置混淆后的实际字符串，[2]放置算术式答案，[3]放置本次算术式生成的运算符
     */
    public String[] oneOpGenerator() {
        String[] result = new String[4];
        Fraction numberA = fractionGenerator();
        Fraction numberB = fractionGenerator();
        switch(opGenerator()) {
            case '-':
                result[3] = "-";
                // 将大的数放在前面
                if(!numberA.isGreaterThan(numberB)) {
                    Fraction temp = numberA;
                    numberA = numberB;
                    numberB = temp;
                }
                // 对于减法的情况，化简的查重字符串和混淆字符串是一样的
                result[0] = numberA.toString() + " - " + numberB.toString();
                result[1] = numberA.toString() + " - " + numberB.toString();
                result[2] = numberA.subtract(numberB).toString();
                break;
            case '÷':
                result[3] = "÷";
                // 保证除法分母不为 0
                while(numberB.isZero() || numberA.isGreaterThan(numberB))
                    numberB = fractionGenerator();
                // 对于减法的情况，化简的查重字符串和混淆字符串是一样的
                result[0] = numberA.toString() + " ÷ " + numberB.toString();
                result[1] = numberA.toString() + " ÷ " + numberB.toString();
                result[2] = numberA.divide(numberB).toString();
                break;
            case '+':
                result[3] = "+";
                // 对于加法的情况，查重字符串要把数从小到大排，而混淆字符串则不需要
                if(numberA.isGreaterThan(numberB)) result[0] = numberB.toString() + " + " + numberA.toString();
                else result[0] = numberA.toString() + " + " + numberB.toString();
                result[1] = numberA.toString() + " + " + numberB.toString();
                result[2] = numberA.add(numberB).toString();
                break;
            case '×':
                result[3] = "×";
                // 对于乘法的情况，查重字符串要把数从小到大排，而混淆字符串则不需要
                if(numberA.isGreaterThan(numberB)) result[0] = numberB.toString() + " × " + numberA.toString();
                else result[0] = numberA.toString() + " × " + numberB.toString();
                result[1] = numberA.toString() + " × " + numberB.toString();
                result[2] = numberA.multiply(numberB).toString();
                break;
        }
        return result;
    }

    /**
     * 二算子算术式生成器
     * @return 字符串数组，[0]放置化简的查重字符串，[1]放置混淆后的实际字符串，[2]放置算术式答案，[3]放置本次算术式生成的运算符
     */
    public String[] twoOpGenerator() {
        // 生成一个单算子算术式
        String[] result = oneOpGenerator();
        Fraction numberA = Fraction.string2Fraction(result[2]);
        Fraction numberB = fractionGenerator();
        switch(opGenerator()){
            case '+':
                result[0] = result[0] + " + " + numberB.toString();
                result[2] = numberA.add(numberB).toString();
                // 随机决定是否扰乱次序
                if(random.nextInt(2) == 0) {
                    // 不扰乱次序
                    result[1] = result[1] + " + " + numberB.toString();
                }
                else {
                    // 扰乱次序要检查符号优先级，如果优先级大，则不需要加括号
                    if(result[3].equals("×") || result[3].equals("÷")) result[1] = numberB.toString() + " + " + result[1];
                    else result[1] = numberB.toString() + " + (" + result[1] + ")";
                }
                result[3] = "+";
                break;
            case '-':
                // 如果前面的数比后面的数小，则需要调换顺序
                if(!numberA.isGreaterThan(numberB)) {
                    // 如果原本表达式符号优先级高，则不需要加括号
                    if(result[3].equals("×") || result[3].equals("÷")){
                        result[0] = numberB.toString() + " - " + result[0];
                        result[1] = numberB.toString() + " - " + result[1];
                        result[2] = numberB.subtract(numberA).toString();
                    }
                    // 如果原本表达式的优先级和当前的相同，则需要加括号
                    else {
                        result[0] = numberB.toString() + " - (" + result[0] + ")";
                        result[1] = numberB.toString() + " - (" + result[1] + ")";
                        result[2] = numberB.subtract(numberA).toString();
                    }
                } else {
                    result[0] = result[0] + " - " + numberB.toString();
                    result[1] = result[1] + " - " + numberB.toString();
                    result[2] = numberA.subtract(numberB).toString();
                }
                result[3] = "-";
                break;
            case '×':
                // 如果原算术式优先级和 × 相等，则不需要加括号
                if(result[3].equals("×") || result[3].equals("÷")) result[0] = result[0] + " × " + numberB.toString();
                else result[0] = "(" + result[0] + ") × " + numberB.toString();
                result[2] = numberA.multiply(numberB).toString();
                // 随机决定是否扰乱次序
                if(random.nextInt(2) == 0) {
                    // 如果遇到加减要加括号
                    if(result[3].equals("×") || result[3].equals("÷")) result[1] = result[1] + " × " + numberB.toString();
                    else result[1] = "(" + result[1] + ") × " + numberB.toString();
                }
                else {
                    // 因为 × 的优先级大，所以扰乱次序在任何情况下都要加括号
                    result[1] = numberB.toString() + " × (" + result[1] + ")";
                }
                result[3] = "×";
                break;
            case '÷':
                while(numberB.isZero())
                    numberB = fractionGenerator();
                // 如果之前的算术式结果为 0，则必须调换位置；后面的随机数决定在符合条件的时候是否更换次序以加大题目随机性
                if(numberA.isZero() || numberB.isGreaterThan(numberA) || random.nextInt(2) == 0) {
                    // 如果原来的式子优先级低
                    if(result[3].equals("+") || result[3].equals("-")) {
                        result[0] = "(" + result[0] + ") ÷ " + numberB.toString();
                        result[1] = "(" + result[1] + ") ÷ " + numberB.toString();
                        result[2] = numberA.divide(numberB).toString();
                    }
                    else {
                        result[0] = result[0] + " ÷ " + numberB.toString();
                        result[1] = result[1] + " ÷ " + numberB.toString();
                        result[2] = numberA.divide(numberB).toString();
                    }
                } else {
                    // 如果更换次序，则无论如何都必须加括号
                    result[0] = numberB.toString() + " ÷ (" + result[0] + ")";
                    result[1] = numberB.toString() + " ÷ (" + result[1] + ")";
                    result[2] = numberB.divide(numberA).toString();
                }
                result[3] = "÷";
                break;
        }
        return result;
    }

    /**
     * 三算子算术式生成器 - A型（3+1）
     * @return 字符串数组，[0]放置化简的查重字符串，[1]放置混淆后的实际字符串，[2]放置算术式答案，[3]放置本次算术式生成的运算符
     */
    public String[] threeOpGeneratorA() {
        // 生成一个双算子算术式
        String[] result = twoOpGenerator();
        Fraction numberA = Fraction.string2Fraction(result[2]);
        Fraction numberB = fractionGenerator();
        switch(opGenerator()){
            case '+':
                result[0] = result[0] + " + " + numberB.toString();
                result[2] = numberA.add(numberB).toString();
                // 随机决定是否扰乱次序
                if(random.nextInt(2) == 0) {
                    // 不扰乱次序
                    result[1] = result[1] + " + " + numberB.toString();
                }
                else {
                    // 扰乱次序要检查符号优先级，如果优先级大，则不需要加括号
                    if(result[3].equals("×") || result[3].equals("÷")) result[1] = numberB.toString() + " + " + result[1];
                    else result[1] = numberB.toString() + " + (" + result[1] + ")";
                }
                result[3] = "+";
                break;
            case '-':
                // 如果前面的数比后面的数小，则需要调换顺序
                if(!numberA.isGreaterThan(numberB)) {
                    // 如果原本表达式符号优先级高，则不需要加括号
                    if(result[3].equals("×") || result[3].equals("÷")){
                        result[0] = numberB.toString() + " - " + result[0];
                        result[1] = numberB.toString() + " - " + result[1];
                        result[2] = numberB.subtract(numberA).toString();
                    }
                    // 如果原本表达式的优先级和当前的相同，则需要加括号
                    else {
                        result[0] = numberB.toString() + " - (" + result[0] + ")";
                        result[1] = numberB.toString() + " - (" + result[1] + ")";
                        result[2] = numberB.subtract(numberA).toString();
                    }
                } else {
                    result[0] = result[0] + " - " + numberB.toString();
                    result[1] = result[1] + " - " + numberB.toString();
                    result[2] = numberA.subtract(numberB).toString();
                }
                result[3] = "-";
                break;
            case '×':
                // 如果原算术式优先级和 × 相等，则不需要加括号
                if(result[3].equals("×") || result[3].equals("÷")) result[0] = result[0] + " × " + numberB.toString();
                else result[0] = "(" + result[0] + ") × " + numberB.toString();
                result[2] = numberA.multiply(numberB).toString();
                // 随机决定是否扰乱次序
                if(random.nextInt(2) == 0) {
                    // 如果遇到加减要加括号
                    if(result[3].equals("×") || result[3].equals("÷")) result[1] = result[1] + " × " + numberB.toString();
                    else result[1] = "(" + result[1] + ") × " + numberB.toString();
                }
                else {
                    // 因为 × 的优先级大，所以扰乱次序在任何情况下都要加括号
                    result[1] = numberB.toString() + " × (" + result[1] + ")";
                }
                result[3] = "×";
                break;
            case '÷':
                while(numberB.isZero())
                    numberB = fractionGenerator();
                // 如果之前的算术式结果为 0，则必须调换位置；后面的随机数决定在符合条件的时候是否更换次序以加大题目随机性
                if(numberA.isZero() || numberB.isGreaterThan(numberA) || random.nextInt(2) == 0) {
                    // 如果原来的式子优先级低
                    if(result[3].equals("+") || result[3].equals("-")) {
                        result[0] = "(" + result[0] + ") ÷ " + numberB.toString();
                        result[1] = "(" + result[1] + ") ÷ " + numberB.toString();
                        result[2] = numberA.divide(numberB).toString();
                    }
                    else {
                        result[0] = result[0] + " ÷ " + numberB.toString();
                        result[1] = result[1] + " ÷ " + numberB.toString();
                        result[2] = numberA.divide(numberB).toString();
                    }
                } else {
                    // 如果更换次序，则无论如何都必须加括号
                    result[0] = numberB.toString() + " ÷ (" + result[0] + ")";
                    result[1] = numberB.toString() + " ÷ (" + result[1] + ")";
                    result[2] = numberB.divide(numberA).toString();
                }
                result[3] = "÷";
                break;
        }
        return result;
    }

    /**
     * 三算子算术式生成器 - B型（2+2）
     * @return 字符串数组，[0]放置化简后的字符串，[1]放置化简前的字符串，[2]放置算术式答案
     */
    public String[] threeOpGeneratorB() {
        String[] result = new String[4];
        String[] expA = oneOpGenerator();
        String[] expB = oneOpGenerator();
        Fraction aheadA = Fraction.string2Fraction(expA[0].substring(0, expA[0].indexOf(" ")));
        Fraction aheadB = Fraction.string2Fraction(expB[0].substring(0, expB[0].indexOf(" ")));
        if(aheadA.isGreaterThan(aheadB)) {
            String[] temp = expA;
            expA = expB;
            expB = temp;
        }
        Fraction numberA = Fraction.string2Fraction(expA[2]);
        Fraction numberB = Fraction.string2Fraction(expB[2]);
        switch(opGenerator()) {
            case '-':
                // 将大的数放在前面
                if(!numberA.isGreaterThan(numberB)) {
                    result[0] = "(" + expB[0] + ")" + " - " + "(" + expA[0] + ")";
                    result[1] = "(" + expB[1] + ")" + " - " + "(" + expA[1] + ")";
                    result[2] = numberB.subtract(numberA).toString();
                }else {
                    // 对于减法的情况，化简的查重字符串和混淆字符串是一样的
                    result[0] = "(" + expA[0] + ")" + " - " + "(" + expB[0] + ")";
                    result[1] = "(" + expA[1] + ")" + " - " + "(" + expB[1] + ")";
                    result[2] = numberA.subtract(numberB).toString();
                }
                result[3] = "-";
                break;
            case '÷':
                // 保证除法分母不为 0
                while(numberB.isZero() || numberA.isGreaterThan(numberB)){
                    expB = oneOpGenerator();
                    numberB = Fraction.string2Fraction(expB[2]);
                }
                // 对于减法的情况，化简的查重字符串和混淆字符串是一样的
                result[0] = "(" + expA[0] + ")" + " ÷ " + "(" + expB[0] + ")";
                result[1] = "(" + expA[1] + ")" + " ÷ " + "(" + expB[1] + ")";
                result[2] = numberA.divide(numberB).toString();
                result[3] = "÷";
                break;
            case '+':
                // 对于加法的情况，查重字符串要把数从小到大排，而混淆字符串则不需要
                if(numberA.isGreaterThan(numberB)) result[0] = "(" + expB[0] + ")" + " + " + "(" + expA[0] + ")";
                else result[0] = "(" + expA[0] + ")" + " + " + "(" + expB[0] + ")";
                result[1] = "(" + expA[1] + ")" + " + " + "(" + expB[1] + ")";
                result[2] = numberA.add(numberB).toString();
                result[3] = "+";
                break;
            case '×':
                // 对于乘法的情况，查重字符串要把数从小到大排，而混淆字符串则不需要
                if(numberA.isGreaterThan(numberB)) result[0] = "(" + expB[0] + ")" + " × " + "(" + expA[0] + ")";
                else result[0] = "(" + expA[0] + ")" + " × " + "(" + expB[0] + ")";
                result[1] = "(" + expA[1] + ")" + " × " + "(" + expB[1] + ")";
                result[2] = numberA.multiply(numberB).toString();
                result[3] = "×";
                break;
        }
        return result;
    }
}
