import java.util.Stack;

/**
 * 分数类
 */
public class Fraction {
    /**
     * 带分数的分子
     */
    private int numerator = 0;
    /**
     * 带分数的分母
     */
    private int denominator = 1;
    /**
     * 符号位（1表示整数，-1表示负数）
     */
    private int symbol = 1;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) throw new ArithmeticException("分母不能为 0 ");
        this.symbol = numerator * denominator < 0 ? -1 : 1;
        this.numerator = Math.abs(numerator);
        this.denominator = Math.abs(denominator);
        this.simplify();
    }

    /**
     * 求两个数的最大公因数
     *
     * @param numberA 数A
     * @param numberB 数B
     * @return 返回最大公因数
     */
    private static int gcd(int numberA, int numberB) {
        if (numberA % numberB == 0) {
            return numberB;
        } else {
            return gcd(numberB, numberA % numberB);
        }
    }

    /**
     * 求两个数的最小公倍数
     *
     * @param numberA 数A
     * @param numberB 数B
     * @return 返回最小公倍数
     */
    private static int lcm(int numberA, int numberB) {
        return numberA * numberB / gcd(numberA, numberB);
    }

    /**
     * 将分数进行化简
     */
    private void simplify() {
        int div = gcd(numerator, denominator);
        if(div != 1) {
            numerator /= div;
            denominator /= div;
        }
    }

    /**
     * 分数加法
     *
     * @param fraction 加数
     * @return 返回分数类型结果
     * 结果为真分数
     */
    public Fraction add(Fraction fraction) {
        // 先获取两个分数分母的最小公倍数
        int mul = lcm(this.denominator, fraction.denominator);
        int numerator = this.symbol * this.numerator * mul / this.denominator
                + fraction.symbol * fraction.numerator * mul / fraction.denominator;
        return new Fraction(numerator, mul);
    }

    /**
     * 分数减法
     *
     * @param fraction 减数
     * @return 返回分数类型结果
     * 结果为真分数
     */
    public Fraction subtract(Fraction fraction) {
        //先获取两个分数分母的最小公倍数
        int mul = lcm(this.denominator, fraction.denominator);
        int numerator = this.symbol * this.numerator * mul / this.denominator
                - fraction.symbol * fraction.numerator * mul / fraction.denominator;
        return new Fraction(numerator, mul);
    }

    /**
     * 分数乘法
     *
     * @param fraction 乘数
     * @return 返回分数类型结果
     * 这里的结果可能不为真分数
     */
    public Fraction multiply(Fraction fraction) {
        //这里只需要随便一个数表示符号
        return new Fraction(this.numerator * fraction.numerator,
                this.symbol * fraction.symbol * this.denominator * fraction.denominator);
    }

    /**
     * 分数除法
     *
     * @param fraction 除数
     * @return 返回分数类型结果
     * 这里的结果可能不为真分数
     */
    public Fraction divide(Fraction fraction) {
        if (fraction.numerator == 0)
            throw new ArithmeticException("除数不能为 0 ");
        Fraction f = new Fraction(fraction.denominator, fraction.numerator);
        return this.multiply(f);
    }

    /**
     * 判断该分数是否比输入分数大
     * @param fraction 输入分数
     * @return true 为大, false 为小于等于
     */
    public boolean isGreaterThan(Fraction fraction) {
        Fraction result = subtract(fraction);
        if(result.symbol == -1) return false;
        else if(result.numerator == 0) return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder fraction = new StringBuilder();
        //先处理符号问题
        if (symbol == -1)
            fraction.append("-");
        if (numerator == 0) {
            fraction.append("0");
        } else if (numerator > denominator) {
            //如果分子比分母大，化为真分数
            fraction.append(numerator / denominator);
            if (numerator % denominator != 0) {
                fraction.append("'");
                fraction.append(numerator % denominator);
                fraction.append("/");
                fraction.append(denominator);
            }
        } else if (numerator < denominator) {
            fraction.append(numerator);
            fraction.append("/");
            fraction.append(denominator);
        } else {
            fraction.append(1);
        }
        return fraction.toString();
    }

    /**
     * 将String转化为Fraction
     *
     * @param s String
     * @return Fraction分数
     */
    public static Fraction string2Fraction(String s) {
        int numerator = 0;
        int denominator = 1;
        //这里取'之后的字符串进行操作
        String[] strings = s.substring(s.indexOf("'") + 1).split("/");
        if (strings.length <= 0) throw new NumberFormatException();
        numerator = Integer.parseInt(strings[0]);
        if (strings.length >= 2) denominator = Integer.parseInt(strings[1]);
        //操作'之前的
        if (s.contains("'")) numerator = Integer.parseInt(s.substring(0, s.indexOf("'"))) * denominator + numerator;
        return new Fraction(numerator, denominator);
    }

    /**
     * 计算字符串四则运算式的函数
     * @param sIn String 表示的四则运算式
     * @return 该四则运算式的答案
     */
    public static Fraction calculateStringExp(String sIn) {
        Stack<Fraction> fractionStack = new Stack<>();
        Stack<Character> symbolStack = new Stack<>();
        String s = sIn.replaceAll(" ","");
        s += "=";
        StringBuffer temp = new StringBuffer();
        for(int i = 0; i < s.length();i++) {
            char ch = s.charAt(i);
            if((ch >= '0' && ch <= '9') || ch == '\'' || ch == '/')
                temp.append(ch);
            else {
                String tempStr = temp.toString();
                if(!tempStr.isEmpty()) {
                    Fraction f = Fraction.string2Fraction(tempStr);
                    fractionStack.push(f);
                    temp = new StringBuffer();
                }
                while(!comparePriority(ch, symbolStack) && !symbolStack.empty()) {
                    Fraction numberB = fractionStack.pop();
                    Fraction numberA = fractionStack.pop();
                    switch(symbolStack.pop()) {
                        case '+':
                            fractionStack.push(numberA.add(numberB));
                            break;
                        case '-':
                            fractionStack.push(numberA.subtract(numberB));
                            break;
                        case '×':
                            fractionStack.push(numberA.multiply(numberB));
                            break;
                        case '÷':
                            fractionStack.push(numberA.divide(numberB));
                            break;
                        default:
                            break;
                    }
                }
                if(ch != '=') {
                    symbolStack.push(ch);
                    if (ch == ')') {
                        symbolStack.pop();
                        symbolStack.pop();
                    }
                }
            }
        }
        return fractionStack.pop();
    }

    /**
     * 判定符号优先级的类
     * @param symbol 符号
     * @param symbolStack 符号栈
     * @return
     */
    private static boolean comparePriority(char symbol, Stack<Character> symbolStack) {
        if (symbolStack.empty()) return true;
        // 符号优先级说明（从高到低）: ( 大于 × ÷ 大于 + - 大于 )
        char top = symbolStack.peek();
        if (top == '(') return true;
        switch (symbol) {
            case '(': return true;
            case '×':
                if (top == '+' || top == '-') return true;
                else return false;
            case '÷':
                if (top == '+' || top == '-') return true;
                else return false;
            case '+': return false;
            case '-': return false;
            case ')': return false;
            case '=': return false;
            default: break;
        }
        return true;
    }

    /**
     * 判断这个分数值是否为 0
     * @return
     */
    public boolean isZero() {
        return numerator == 0;
    }

}
