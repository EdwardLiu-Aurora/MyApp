# ��������

[GitHub�ֿ�](https://github.com/EdwardLiu-Aurora/MyApp)

## ����ʵ��

- [x] ʹ�� -n ��������������Ŀ�ĸ��������Ҹ��ݽ�ռ������û��趨�ķ�Χ(�� range == 2 ʱ���û�ȴҪ������ 10000 ����Ŀ�������Բ�����)
- [x] ʹ�� -r ����������Ŀ��**��Ȼ������������������ĸ�ķ�Χ** �ò�����������Ϊ**���� 2 ����Ȼ��**
- [x] ���ɵ���Ŀ�ڼ�����̲��ܲ�������
- [x] ���ɵ���Ŀ�������������e<sub>1</sub> �� e<sub>2</sub>���ӱ��ʽ����ô����Ӧ��**�����**
- [x] ����һ���������ɵ���Ŀ**�����ظ�**�����ɵ���Ŀ����ִ�г���Ŀ¼�µ�**Exercises.txt**�ļ���
- [x] ÿ����Ŀ�г��ֵ����������������3��(����������)
- [x] ��������Ŀ��ͬʱ�������������Ŀ�Ĵ𰸣�������ִ�г���ĵ�ǰĿ¼�µ�**Answers.txt**�ļ�
- [x] ����Ӧ��֧��һ�����Ŀ�����ɡ�
- [x] ����֧�ֶԸ�������Ŀ�ļ��ʹ��ļ����ж����еĶԴ���������ͳ�ơ�

## ��ƹ���

### ���ʽ������

������Ŀ��Ҫ�󣬱��ʽ����������ܳ��� 3 ������������ɵı��ʽ������Թ���Ϊ�������ࣺ

- �����ӱ��ʽ
    - ���� A ? B �ı��ʽ
    - �����ɱ��ʽʱ��** + �� **����ӵ�н����ɵķ���ʱ��Ĭ�ϰ��ղ���ʽ A < B ��˳��������ؼ���
- ˫���ӱ��ʽ 
    - ���� (A ? B) ? C �ı��ʽ
    - �����ɱ��ʽʱֻҪ��֤�����ڵķ������㽻����ʱ��Ĭ�ϰ��ղ���ʽ A < B ��˳��������ؼ���
- ������ A �ͱ��ʽ
    - ���� ((A ? B) ? C) ? D) �ı��ʽ
    - �����ɱ��ʽʱ�����ع����˫���ӱ��ʽһ����ֻ��Ҫ���ֲ���ʽ�� A < B ��������� C �� D����Ϊ������Ŀ���� ((A ? B) ? C) ? D) �� ((A ? B) ? D) ? C) ��������ͬ����Ŀ
- ������ B �ͱ��ʽ
    - ���� (A ? B) ? (C ? D) �ı��ʽ
    - �����ɱ��ʽʱ����֤����ʽ A < B �� C < D �� A < C ���ɡ�

![���ֱ��ʽ�ľ���](resources/1.png)

> ����������м�����Ҫ���ͣ�
>
> ����ʽ������������������Ŀʱ��Ϊ�˼����Ŀ�ظ�������Ŀ��д�������ض�����ı��ʽ���ñ��ʽ�����ʵ����Ŀ��һ���ģ���ֻΪ���ط��񣬿��ܲ�����������յ���Ŀ����� 1 + 2 ���� 2 + 1 �Ĳ���ʽ��(1 + 3) + (2 + 4) �� (4 + 2) + (3 + 1) �Ĳ���ʽ
>
> ͵����д������Ϊʵ���ϣ����ı��ʽ�а����˶̵ı��ʽ������ֻ��Ҫд��**�����ӱ��ʽ**��**˫���ӱ��ʽ**������ı��ʽ���ɺ����Ϳ���ֱ������ǰ��������������ģʽ���������˺ܶ��ظ��Ͷ�������˫���ӱ��ʽ���(A ? B)���ֿ������������ӱ��ʽ�������������ɡ�

### �����ı���

����ֻ���ڼ�������ʱ������ÿ��������������ʱ��ֻ��Ҫ���λ�����ı��ʽ��������ڵ���λ���Ҳ�ļ��ɡ����򣬽���������������Ҳ�������

### �����ٷ����ı���

�����ٷ���ֻ����λ���Ҳ�Ĳ���������λ�����Ĳ�����ʱ������ֻ��Ҫ���λ�����ı��ʽС�ڻ�����Ҳ�ļ��ɡ����򣬽���������������Ҳ�������

### �������ı�ʾ

��������ٷ������������������Ե��ɷ��������м��㡣�����ɲ�������ʱ�����Ǿͻ�ʹ��һ�������������������ض��������ɷ����������ʽ�Ĳ���Ҳ�Ƿ����ͷ���֮��Ĳ�����ֱ��������ɱ��ʽʱ���ŻὫ��������ת�������

### �ж��Ƿ��ظ�

��Ϊ����ʽ����ȷ������ͬ�������ʽ�������Ϊͬһ����ʽ�����Կ���ֱ�ӽ�����ʽ�Ž� HashSet �У�һ����ѯ��һ������ʽ�Ѿ������� HashSet �У���֤�����ʽ���Ѿ��ظ���������û���ظ���

## ����

### ������ Fraction

ʵ���˷����Ĵ洢���Ӽ��˳��������㡢���򡢺��ַ������໥ת���Լ��ַ�������ʽ�ļ���ȹ���

```java
import java.util.Stack;

/**
 * ������
 */
public class Fraction {
    /**
     * �������ķ���
     */
    private int numerator = 0;
    /**
     * �������ķ�ĸ
     */
    private int denominator = 1;
    /**
     * ����λ��1��ʾ������-1��ʾ������
     */
    private int symbol = 1;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) throw new ArithmeticException("��ĸ����Ϊ 0 ");
        this.symbol = numerator * denominator < 0 ? -1 : 1;
        this.numerator = Math.abs(numerator);
        this.denominator = Math.abs(denominator);
        this.simplify();
    }

    /**
     * �����������������
     *
     * @param numberA ��A
     * @param numberB ��B
     * @return �����������
     */
    private static int gcd(int numberA, int numberB) {
        if (numberA % numberB == 0) {
            return numberB;
        } else {
            return gcd(numberB, numberA % numberB);
        }
    }

    /**
     * ������������С������
     *
     * @param numberA ��A
     * @param numberB ��B
     * @return ������С������
     */
    private static int lcm(int numberA, int numberB) {
        return numberA * numberB / gcd(numberA, numberB);
    }

    /**
     * ���������л���
     */
    private void simplify() {
        int div = gcd(numerator, denominator);
        if(div != 1) {
            numerator /= div;
            denominator /= div;
        }
    }

    /**
     * �����ӷ�
     *
     * @param fraction ����
     * @return ���ط������ͽ��
     * ���Ϊ�����
     */
    public Fraction add(Fraction fraction) {
        // �Ȼ�ȡ����������ĸ����С������
        int mul = lcm(this.denominator, fraction.denominator);
        int numerator = this.symbol * this.numerator * mul / this.denominator
                + fraction.symbol * fraction.numerator * mul / fraction.denominator;
        return new Fraction(numerator, mul);
    }

    /**
     * ��������
     *
     * @param fraction ����
     * @return ���ط������ͽ��
     * ���Ϊ�����
     */
    public Fraction subtract(Fraction fraction) {
        //�Ȼ�ȡ����������ĸ����С������
        int mul = lcm(this.denominator, fraction.denominator);
        int numerator = this.symbol * this.numerator * mul / this.denominator
                - fraction.symbol * fraction.numerator * mul / fraction.denominator;
        return new Fraction(numerator, mul);
    }

    /**
     * �����˷�
     *
     * @param fraction ����
     * @return ���ط������ͽ��
     * ����Ľ�����ܲ�Ϊ�����
     */
    public Fraction multiply(Fraction fraction) {
        //����ֻ��Ҫ���һ������ʾ����
        return new Fraction(this.numerator * fraction.numerator,
                this.symbol * fraction.symbol * this.denominator * fraction.denominator);
    }

    /**
     * ��������
     *
     * @param fraction ����
     * @return ���ط������ͽ��
     * ����Ľ�����ܲ�Ϊ�����
     */
    public Fraction divide(Fraction fraction) {
        if (fraction.numerator == 0)
            throw new ArithmeticException("��������Ϊ 0 ");
        Fraction f = new Fraction(fraction.denominator, fraction.numerator);
        return this.multiply(f);
    }

    /**
     * �жϸ÷����Ƿ�����������
     * @param fraction �������
     * @return true Ϊ��, false ΪС�ڵ���
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
        //�ȴ����������
        if (symbol == -1)
            fraction.append("-");
        if (numerator == 0) {
            fraction.append("0");
        } else if (numerator > denominator) {
            //������ӱȷ�ĸ�󣬻�Ϊ�����
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
     * ��Stringת��ΪFraction
     *
     * @param s String
     * @return Fraction����
     */
    public static Fraction string2Fraction(String s) {
        int numerator = 0;
        int denominator = 1;
        //����ȡ'֮����ַ������в���
        String[] strings = s.substring(s.indexOf("'") + 1).split("/");
        if (strings.length <= 0) throw new NumberFormatException();
        numerator = Integer.parseInt(strings[0]);
        if (strings.length >= 2) denominator = Integer.parseInt(strings[1]);
        //����'֮ǰ��
        if (s.contains("'")) numerator = Integer.parseInt(s.substring(0, s.indexOf("'"))) * denominator + numerator;
        return new Fraction(numerator, denominator);
    }

    /**
     * �����ַ�����������ʽ�ĺ���
     * @param sIn String ��ʾ����������ʽ
     * @return ����������ʽ�Ĵ�
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
                        case '��':
                            fractionStack.push(numberA.multiply(numberB));
                            break;
                        case '��':
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
     * �ж��������ȼ�����
     * @param symbol ����
     * @param symbolStack ����ջ
     * @return
     */
    private static boolean comparePriority(char symbol, Stack<Character> symbolStack) {
        if (symbolStack.empty()) return true;
        // �������ȼ�˵�����Ӹߵ��ͣ�: ( ���� �� �� ���� + - ���� )
        char top = symbolStack.peek();
        if (top == '(') return true;
        switch (symbol) {
            case '(': return true;
            case '��':
                if (top == '+' || top == '-') return true;
                else return false;
            case '��':
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
     * �ж��������ֵ�Ƿ�Ϊ 0
     * @return
     */
    public boolean isZero() {
        return numerator == 0;
    }

}
```

### ExerciseGenerator ����ʽ������

�����˸��ฺ��������ɵĺ���
- ������ɷ���
- ������ɷ���
- ������ɵ����ӱ��ʽ
- ������ɶ����ӱ��ʽ
- ������������� A �ͱ��ʽ
- ������������� B �ͱ��ʽ
- ����ʽ�Ĳ���
- ���ձ��ʽ�ʹ𰸵����

```java
import java.util.*;

// ������Ŀ����
public class ExerciseGenerator {
    /**
     * ��ֵ��Χ
     */
    private int range;
    /**
     * ��Ŀ����
     */
    private int number;
    /**
     * ��������ӣ��������ɸ������ѡ��
     */
    private Random random = new Random(System.currentTimeMillis());
    /**
     * ��֤�ظ�ʹ�õĹ�ϣ����
     */
    private Set<String> duplicateCheckSet = new HashSet<>();
    /**
     * �洢��ʹ�õĹ�ϣӳ��� <��ʽ, ��>
     */
    private HashMap<String, String> resultMap = new HashMap<>();

    public ExerciseGenerator(){}
    public ExerciseGenerator(int range, int number){
        if(range < 2) throw new IllegalArgumentException("��ֵ�ķ�Χ����С�� 2 ");
        if(number < 1) throw new IllegalArgumentException("��Ŀ����������С�� 1 ");
        this.range = range;
        this.number = number;
    }

    /**
     * ��������ʽ�ʹ𰸵���
     * @return ����Ӧ range �������� number ������ʽʱ�����ر��ʽ�ʹ𰸣����򷵻� null
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
     * ��ֵ������
     *
     * @return ��������
     */
    public Fraction fractionGenerator() {
        if(range < 1) throw new IllegalArgumentException("��ֵ�ķ�Χ����С�� 1 ");
        // ��ĸ��ΧΪ 1 - range, ������ range
        int denominator = random.nextInt(range - 1) + 1;
        int numerator = 0;
        // ���ӷ�ΧΪ 0 - range ^ 2, ������ range ^ 2
        numerator = random.nextInt(denominator * denominator + 1);
        return new Fraction(numerator, denominator);
    }

    /**
     * ����������
     * @return + - �� �� �е���һһ�������
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
                result = '��';
                break;
            case 3:
                result = '��';
                break;
            default:
                result = '+';
        }
        return result;
    }

    /**
     * ����������ʽ������
     * @return �ַ������飬[0]���û���Ĳ����ַ�����[1]���û������ʵ���ַ�����[2]��������ʽ�𰸣�[3]���ñ�������ʽ���ɵ������
     */
    public String[] oneOpGenerator() {
        String[] result = new String[4];
        Fraction numberA = fractionGenerator();
        Fraction numberB = fractionGenerator();
        switch(opGenerator()) {
            case '-':
                result[3] = "-";
                // �����������ǰ��
                if(!numberA.isGreaterThan(numberB)) {
                    Fraction temp = numberA;
                    numberA = numberB;
                    numberB = temp;
                }
                // ���ڼ��������������Ĳ����ַ����ͻ����ַ�����һ����
                result[0] = numberA.toString() + " - " + numberB.toString();
                result[1] = numberA.toString() + " - " + numberB.toString();
                result[2] = numberA.subtract(numberB).toString();
                break;
            case '��':
                result[3] = "��";
                // ��֤������ĸ��Ϊ 0
                while(numberB.isZero() || numberA.isGreaterThan(numberB))
                    numberB = fractionGenerator();
                // ���ڼ��������������Ĳ����ַ����ͻ����ַ�����һ����
                result[0] = numberA.toString() + " �� " + numberB.toString();
                result[1] = numberA.toString() + " �� " + numberB.toString();
                result[2] = numberA.divide(numberB).toString();
                break;
            case '+':
                result[3] = "+";
                // ���ڼӷ�������������ַ���Ҫ������С�����ţ��������ַ�������Ҫ
                if(numberA.isGreaterThan(numberB)) result[0] = numberB.toString() + " + " + numberA.toString();
                else result[0] = numberA.toString() + " + " + numberB.toString();
                result[1] = numberA.toString() + " + " + numberB.toString();
                result[2] = numberA.add(numberB).toString();
                break;
            case '��':
                result[3] = "��";
                // ���ڳ˷�������������ַ���Ҫ������С�����ţ��������ַ�������Ҫ
                if(numberA.isGreaterThan(numberB)) result[0] = numberB.toString() + " �� " + numberA.toString();
                else result[0] = numberA.toString() + " �� " + numberB.toString();
                result[1] = numberA.toString() + " �� " + numberB.toString();
                result[2] = numberA.multiply(numberB).toString();
                break;
        }
        return result;
    }

    /**
     * ����������ʽ������
     * @return �ַ������飬[0]���û���Ĳ����ַ�����[1]���û������ʵ���ַ�����[2]��������ʽ�𰸣�[3]���ñ�������ʽ���ɵ������
     */
    public String[] twoOpGenerator() {
        // ����һ������������ʽ
        String[] result = oneOpGenerator();
        Fraction numberA = Fraction.string2Fraction(result[2]);
        Fraction numberB = fractionGenerator();
        switch(opGenerator()){
            case '+':
                result[0] = result[0] + " + " + numberB.toString();
                result[2] = numberA.add(numberB).toString();
                // ��������Ƿ����Ҵ���
                if(random.nextInt(2) == 0) {
                    // �����Ҵ���
                    result[1] = result[1] + " + " + numberB.toString();
                }
                else {
                    // ���Ҵ���Ҫ���������ȼ���������ȼ�������Ҫ������
                    if(result[3].equals("��") || result[3].equals("��")) result[1] = numberB.toString() + " + " + result[1];
                    else result[1] = numberB.toString() + " + (" + result[1] + ")";
                }
                result[3] = "+";
                break;
            case '-':
                // ���ǰ������Ⱥ������С������Ҫ����˳��
                if(!numberA.isGreaterThan(numberB)) {
                    // ���ԭ�����ʽ�������ȼ��ߣ�����Ҫ������
                    if(result[3].equals("��") || result[3].equals("��")){
                        result[0] = numberB.toString() + " - " + result[0];
                        result[1] = numberB.toString() + " - " + result[1];
                        result[2] = numberB.subtract(numberA).toString();
                    }
                    // ���ԭ�����ʽ�����ȼ��͵�ǰ����ͬ������Ҫ������
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
            case '��':
                // ���ԭ����ʽ���ȼ��� �� ��ȣ�����Ҫ������
                if(result[3].equals("��") || result[3].equals("��")) result[0] = result[0] + " �� " + numberB.toString();
                else result[0] = "(" + result[0] + ") �� " + numberB.toString();
                result[2] = numberA.multiply(numberB).toString();
                // ��������Ƿ����Ҵ���
                if(random.nextInt(2) == 0) {
                    // ��������Ӽ�Ҫ������
                    if(result[3].equals("��") || result[3].equals("��")) result[1] = result[1] + " �� " + numberB.toString();
                    else result[1] = "(" + result[1] + ") �� " + numberB.toString();
                }
                else {
                    // ��Ϊ �� �����ȼ����������Ҵ������κ�����¶�Ҫ������
                    result[1] = numberB.toString() + " �� (" + result[1] + ")";
                }
                result[3] = "��";
                break;
            case '��':
                while(numberB.isZero())
                    numberB = fractionGenerator();
                // ���֮ǰ������ʽ���Ϊ 0����������λ�ã����������������ڷ���������ʱ���Ƿ���������ԼӴ���Ŀ�����
                if(numberA.isZero() || numberB.isGreaterThan(numberA) || random.nextInt(2) == 0) {
                    // ���ԭ����ʽ�����ȼ���
                    if(result[3].equals("+") || result[3].equals("-")) {
                        result[0] = "(" + result[0] + ") �� " + numberB.toString();
                        result[1] = "(" + result[1] + ") �� " + numberB.toString();
                        result[2] = numberA.divide(numberB).toString();
                    }
                    else {
                        result[0] = result[0] + " �� " + numberB.toString();
                        result[1] = result[1] + " �� " + numberB.toString();
                        result[2] = numberA.divide(numberB).toString();
                    }
                } else {
                    // �������������������ζ����������
                    result[0] = numberB.toString() + " �� (" + result[0] + ")";
                    result[1] = numberB.toString() + " �� (" + result[1] + ")";
                    result[2] = numberB.divide(numberA).toString();
                }
                result[3] = "��";
                break;
        }
        return result;
    }

    /**
     * ����������ʽ������ - A�ͣ�3+1��
     * @return �ַ������飬[0]���û���Ĳ����ַ�����[1]���û������ʵ���ַ�����[2]��������ʽ�𰸣�[3]���ñ�������ʽ���ɵ������
     */
    public String[] threeOpGeneratorA() {
        // ����һ��˫��������ʽ
        String[] result = twoOpGenerator();
        Fraction numberA = Fraction.string2Fraction(result[2]);
        Fraction numberB = fractionGenerator();
        switch(opGenerator()){
            case '+':
                result[0] = result[0] + " + " + numberB.toString();
                result[2] = numberA.add(numberB).toString();
                // ��������Ƿ����Ҵ���
                if(random.nextInt(2) == 0) {
                    // �����Ҵ���
                    result[1] = result[1] + " + " + numberB.toString();
                }
                else {
                    // ���Ҵ���Ҫ���������ȼ���������ȼ�������Ҫ������
                    if(result[3].equals("��") || result[3].equals("��")) result[1] = numberB.toString() + " + " + result[1];
                    else result[1] = numberB.toString() + " + (" + result[1] + ")";
                }
                result[3] = "+";
                break;
            case '-':
                // ���ǰ������Ⱥ������С������Ҫ����˳��
                if(!numberA.isGreaterThan(numberB)) {
                    // ���ԭ�����ʽ�������ȼ��ߣ�����Ҫ������
                    if(result[3].equals("��") || result[3].equals("��")){
                        result[0] = numberB.toString() + " - " + result[0];
                        result[1] = numberB.toString() + " - " + result[1];
                        result[2] = numberB.subtract(numberA).toString();
                    }
                    // ���ԭ�����ʽ�����ȼ��͵�ǰ����ͬ������Ҫ������
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
            case '��':
                // ���ԭ����ʽ���ȼ��� �� ��ȣ�����Ҫ������
                if(result[3].equals("��") || result[3].equals("��")) result[0] = result[0] + " �� " + numberB.toString();
                else result[0] = "(" + result[0] + ") �� " + numberB.toString();
                result[2] = numberA.multiply(numberB).toString();
                // ��������Ƿ����Ҵ���
                if(random.nextInt(2) == 0) {
                    // ��������Ӽ�Ҫ������
                    if(result[3].equals("��") || result[3].equals("��")) result[1] = result[1] + " �� " + numberB.toString();
                    else result[1] = "(" + result[1] + ") �� " + numberB.toString();
                }
                else {
                    // ��Ϊ �� �����ȼ����������Ҵ������κ�����¶�Ҫ������
                    result[1] = numberB.toString() + " �� (" + result[1] + ")";
                }
                result[3] = "��";
                break;
            case '��':
                while(numberB.isZero())
                    numberB = fractionGenerator();
                // ���֮ǰ������ʽ���Ϊ 0����������λ�ã����������������ڷ���������ʱ���Ƿ���������ԼӴ���Ŀ�����
                if(numberA.isZero() || numberB.isGreaterThan(numberA) || random.nextInt(2) == 0) {
                    // ���ԭ����ʽ�����ȼ���
                    if(result[3].equals("+") || result[3].equals("-")) {
                        result[0] = "(" + result[0] + ") �� " + numberB.toString();
                        result[1] = "(" + result[1] + ") �� " + numberB.toString();
                        result[2] = numberA.divide(numberB).toString();
                    }
                    else {
                        result[0] = result[0] + " �� " + numberB.toString();
                        result[1] = result[1] + " �� " + numberB.toString();
                        result[2] = numberA.divide(numberB).toString();
                    }
                } else {
                    // �������������������ζ����������
                    result[0] = numberB.toString() + " �� (" + result[0] + ")";
                    result[1] = numberB.toString() + " �� (" + result[1] + ")";
                    result[2] = numberB.divide(numberA).toString();
                }
                result[3] = "��";
                break;
        }
        return result;
    }

    /**
     * ����������ʽ������ - B�ͣ�2+2��
     * @return �ַ������飬[0]���û������ַ�����[1]���û���ǰ���ַ�����[2]��������ʽ��
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
                // �����������ǰ��
                if(!numberA.isGreaterThan(numberB)) {
                    result[0] = "(" + expB[0] + ")" + " - " + "(" + expA[0] + ")";
                    result[1] = "(" + expB[1] + ")" + " - " + "(" + expA[1] + ")";
                    result[2] = numberB.subtract(numberA).toString();
                }else {
                    // ���ڼ��������������Ĳ����ַ����ͻ����ַ�����һ����
                    result[0] = "(" + expA[0] + ")" + " - " + "(" + expB[0] + ")";
                    result[1] = "(" + expA[1] + ")" + " - " + "(" + expB[1] + ")";
                    result[2] = numberA.subtract(numberB).toString();
                }
                result[3] = "-";
                break;
            case '��':
                // ��֤������ĸ��Ϊ 0
                while(numberB.isZero() || numberA.isGreaterThan(numberB)){
                    expB = oneOpGenerator();
                    numberB = Fraction.string2Fraction(expB[2]);
                }
                // ���ڼ��������������Ĳ����ַ����ͻ����ַ�����һ����
                result[0] = "(" + expA[0] + ")" + " �� " + "(" + expB[0] + ")";
                result[1] = "(" + expA[1] + ")" + " �� " + "(" + expB[1] + ")";
                result[2] = numberA.divide(numberB).toString();
                result[3] = "��";
                break;
            case '+':
                // ���ڼӷ�������������ַ���Ҫ������С�����ţ��������ַ�������Ҫ
                if(numberA.isGreaterThan(numberB)) result[0] = "(" + expB[0] + ")" + " + " + "(" + expA[0] + ")";
                else result[0] = "(" + expA[0] + ")" + " + " + "(" + expB[0] + ")";
                result[1] = "(" + expA[1] + ")" + " + " + "(" + expB[1] + ")";
                result[2] = numberA.add(numberB).toString();
                result[3] = "+";
                break;
            case '��':
                // ���ڳ˷�������������ַ���Ҫ������С�����ţ��������ַ�������Ҫ
                if(numberA.isGreaterThan(numberB)) result[0] = "(" + expB[0] + ")" + " �� " + "(" + expA[0] + ")";
                else result[0] = "(" + expA[0] + ")" + " �� " + "(" + expB[0] + ")";
                result[1] = "(" + expA[1] + ")" + " �� " + "(" + expB[1] + ")";
                result[2] = numberA.multiply(numberB).toString();
                result[3] = "��";
                break;
        }
        return result;
    }
}
```

### UserInterface �û��ӿ���

���������Ŀ�����ɺ���ҵ������

```java
import java.beans.Transient;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UserInterface {
    public static void mainTest(String args[]) {
        int number = 0;
        int range = 0;
        String exercise = null;
        String answer = null;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-n")) number = Integer.valueOf(args[++i]);
            if (args[i].equals("-r")) range = Integer.valueOf(args[++i]);
            if (args[i].equals("-e")) exercise = args[++i];
            if (args[i].equals("-a")) answer = args[++i];
        }
        if (number > 0 && range > 1) {
            ExerciseGenerator exGen = new ExerciseGenerator(range, number);
            HashMap<String, String> result = exGen.generateExp();
            File exerciseFile = new File("Exercises.txt");
            File answerFile = new File("Answers.txt");
            FileWriter exerciseFileFW = null;
            FileWriter answerFileFW = null;
            try {
                exerciseFileFW = new FileWriter(exerciseFile);
                answerFileFW = new FileWriter(answerFile);
                if (result != null) {
                    int i = 1;
                    for (Map.Entry<String, String> entry : result.entrySet()) {
                        exerciseFileFW.append(i + ". " + entry.getKey() + "\r\n");
                        answerFileFW.append(i + ". " + entry.getValue() + "\r\n");
                        i++;
                        exerciseFileFW.flush();
                        answerFileFW.flush();
                    }
                    System.out.println("��ɳ��⡣");
                } else {
                    System.out.println("���С������������������ֵ��Χ��");
                }
            } catch (IOException e) {
                System.out.println("�����Ŀ¼�Ƿ��д��");
            }
        }
        if (exercise != null && answer != null) {
            StringBuilder correct = new StringBuilder("");
            StringBuilder wrong = new StringBuilder("");
            int correctInt = 0;
            int wrongInt = 0;
            File exercises = new File(exercise);
            File answers = new File(answer);
            File grades = new File("Grade.txt");
            BufferedReader exercisesReader = null;
            BufferedReader answersReader = null;
            String e = null;
            String a = null;
            String t = null;
            try {
                exercisesReader = new BufferedReader(new FileReader(exercises));
                answersReader = new BufferedReader(new FileReader(answers));
                while((e=exercisesReader.readLine())!=null){
                    a = answersReader.readLine();
                    t = e.substring(0, e.indexOf("."));
                    if(Fraction.calculateStringExp(e.substring(e.indexOf(" ") + 1))
                            .toString()
                            .equals(a.substring(a.indexOf(" ") + 1))) {
                        correct.append(t).append(",");
                        correctInt++;
                    }
                    else {
                        wrong.append(t).append(",");
                        wrongInt++;
                    }
                }
                if(correct.length()>0) correct.deleteCharAt(correct.length()-1);
                if(wrong.length()>0) wrong.deleteCharAt(wrong.length()-1);
                FileWriter gradesFW = new FileWriter(grades);
                gradesFW.append("Correct: ");
                gradesFW.append(correctInt + "(");
                gradesFW.append(correct.toString() + ")");
                gradesFW.append("\r\n");
                gradesFW.flush();
                gradesFW.append("Wrong: ");
                gradesFW.append(wrongInt + "(");
                gradesFW.append(wrong.toString() + ")");
                gradesFW.append("\r\n");
                gradesFW.flush();
            }
            catch(Exception ex){
                System.out.println("���ĳ����������������ļ����Ƿ���ȷ��");
            }
            System.out.println("������ġ�");
        }
    }
}
```

## ����

����Ŀ���в��Զ�ʹ�� Junit ���У����Ը��������еķ�����

### FractionS2FTest �����ַ���<->������������

```java
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value=Parameterized.class)
public class FractionS2FTest {
    private String input;
    private String output;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {"0","0"},
                {"1/4","1/4"},
                {"2/4","1/2"},
                {"3/4","3/4"},
                {"4/4","1"},
                {"5/4","1'1/4"},
                {"6/4","1'1/2"},
                {"7/4","1'3/4"},
                {"8/4","2"},
                {"9/4","2'1/4"},
                {"10/4","2'1/2"},
                {"11/4","2'3/4"},
                {"12/4","3"},
                {"13/4","3'1/4"},
                {"14/4","3'1/2"},
                {"15/4","3'3/4"}
        });
    }

    public FractionS2FTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Test
    public void test() {
        System.out.println("Input: " + input + " Output: " + output);
        assertEquals(Fraction.string2Fraction(input).toString(), output);
        assertEquals(Fraction.string2Fraction(output).toString(), output);
    }
}
```

### FractionConstructorTest ���Է������캯���ͻ�����

```java
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value=Parameterized.class)
public class FractionConstructorTest {
    private String expected;
    private int numerator;
    private int denominator;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {0,4,"0"},
                {1,4,"1/4"},
                {2,4,"1/2"},
                {3,4,"3/4"},
                {4,4,"1"},
                {5,4,"1'1/4"},
                {6,4,"1'1/2"},
                {7,4,"1'3/4"},
                {8,4,"2"},
                {9,4,"2'1/4"},
                {10,4,"2'1/2"},
                {11,4,"2'3/4"},
                {12,4,"3"},
                {13,4,"3'1/4"},
                {14,4,"3'1/2"},
                {15,4,"3'3/4"}
        });
    }

    public FractionConstructorTest(int numerator, int denominator, String expected) {
        this.expected = expected;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Test
    public void test() {
        String result = new Fraction(numerator,denominator).toString();
        System.out.println("The input fraction is: " + numerator + "/" + denominator + " and expression is: " + result);
        assertEquals(expected, result);
    }
}
```

### FractionArithmeticTest ���Է����������������ʽ�������㹦��

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionArithmeticTest {
    @Test
    public void addTest() {
        assertEquals(Fraction.string2Fraction("44/5").toString(), Fraction.string2Fraction("8/1").add(Fraction.string2Fraction("4/5")).toString());
        assertEquals(Fraction.string2Fraction("2/1").toString(), Fraction.string2Fraction("0/4").add(Fraction.string2Fraction("6/3")).toString());
        assertEquals(Fraction.string2Fraction("79/24").toString(), Fraction.string2Fraction("8/3").add(Fraction.string2Fraction("5/8")).toString());
        assertEquals(Fraction.string2Fraction("2/1").toString(), Fraction.string2Fraction("8/6").add(Fraction.string2Fraction("4/6")).toString());
        assertEquals(Fraction.string2Fraction("3/7").toString(), Fraction.string2Fraction("3/7").add(Fraction.string2Fraction("0/5")).toString());
    }

    @Test
    public void subtractTest() {
        assertEquals(Fraction.string2Fraction("47/56").toString(), Fraction.string2Fraction("9/8").subtract(Fraction.string2Fraction("2/7")).toString());
        assertEquals(Fraction.string2Fraction("7/6").toString(), Fraction.string2Fraction("5/3").subtract(Fraction.string2Fraction("1/2")).toString());
        assertEquals(Fraction.string2Fraction("1/1").toString(), Fraction.string2Fraction("2/1").subtract(Fraction.string2Fraction("6/6")).toString());
        assertEquals(Fraction.string2Fraction("1/2").toString(), Fraction.string2Fraction("2/3").subtract(Fraction.string2Fraction("1/6")).toString());
        assertEquals(Fraction.string2Fraction("1/2").toString(), Fraction.string2Fraction("3/6").subtract(Fraction.string2Fraction("0/3")).toString());
    }

    @Test
    public void multiplyTest() {
        assertEquals(Fraction.string2Fraction("0/1").toString(), Fraction.string2Fraction("0/9").multiply(Fraction.string2Fraction("8/4")).toString());
        assertEquals(Fraction.string2Fraction("0/1").toString(), Fraction.string2Fraction("6/5").multiply(Fraction.string2Fraction("0/4")).toString());
        assertEquals(Fraction.string2Fraction("16/63").toString(), Fraction.string2Fraction("4/9").multiply(Fraction.string2Fraction("4/7")).toString());
        assertEquals(Fraction.string2Fraction("7/8").toString(), Fraction.string2Fraction("6/8").multiply(Fraction.string2Fraction("7/6")).toString());
        assertEquals(Fraction.string2Fraction("28/27").toString(), Fraction.string2Fraction("8/9").multiply(Fraction.string2Fraction("7/6")).toString());
    }

    @Test
    public void divideTest() {
        assertEquals(Fraction.string2Fraction("0/1").toString(), Fraction.string2Fraction("0/7").divide(Fraction.string2Fraction("13/4")).toString());
        assertEquals(Fraction.string2Fraction("7/5").toString(), Fraction.string2Fraction("3/5").divide(Fraction.string2Fraction("3/7")).toString());
        assertEquals(Fraction.string2Fraction("12/5").toString(), Fraction.string2Fraction("6/1").divide(Fraction.string2Fraction("5/2")).toString());
        assertEquals(Fraction.string2Fraction("32/9").toString(), Fraction.string2Fraction("8/3").divide(Fraction.string2Fraction("3/4")).toString());
        assertEquals(Fraction.string2Fraction("15/4").toString(), Fraction.string2Fraction("6/8").divide(Fraction.string2Fraction("1/5")).toString());
    }

    @Test
    public void isZeroTest() {
        assertEquals(true, Fraction.string2Fraction("0/4").isZero());
    }

    @Test
    public void isGreaterThanTest() {
        assertEquals(true, Fraction.string2Fraction("5/4").isGreaterThan(Fraction.string2Fraction("1/6")));
        assertEquals(false, Fraction.string2Fraction("1/2").isGreaterThan(Fraction.string2Fraction("1/2")));
        assertEquals(false, Fraction.string2Fraction("2/8").isGreaterThan(Fraction.string2Fraction("3/8")));
    }

    @Test
    public void calculateStringExpTest() {
        assertEquals("60'43/60", Fraction.calculateStringExp("(4/5 + 3'1/4) + (8'8/9 �� 6'3/8)").toString());
        assertEquals("0", Fraction.calculateStringExp("(1 �� 0) �� (6 + 3/8)").toString());
        assertEquals("49'205/294", Fraction.calculateStringExp("2'5/7 �� (3'1/2 + (6'1/7 + 8'2/3))").toString());
        assertEquals("5'1/10", Fraction.calculateStringExp("3'2/3 �� 3 - 1'1/2 - 4'2/5").toString());
        assertEquals("0", Fraction.calculateStringExp("(4'1/2 - (1/2 + 4)) �� 0").toString());
        assertEquals("1", Fraction.calculateStringExp("(5/7 + 1'1/4) - (1'5/7 - 3/4)").toString());
        assertEquals("196/375", Fraction.calculateStringExp("4'1/5 �� ((4/5 - 1/3) �� 3'3/4)").toString());
        assertEquals("3/7", Fraction.calculateStringExp("(1'3/4 �� 1'1/3) �� (3'4/9 + 2)").toString());
        assertEquals("15'7/9", Fraction.calculateStringExp("2 �� (4'8/9 + 3) - 0").toString());
        assertEquals("23/35", Fraction.calculateStringExp("(1 + 5'4/7) �� (4 �� 2'1/2)").toString());
        assertEquals("10/107", Fraction.calculateStringExp("1 �� (2'3/4 + 2'3/5) �� 1/2").toString());
        assertEquals("1'1/42",Fraction.calculateStringExp("2'6/7 - 2'2/3 - 1/6 + 1").toString());
        assertEquals("1'26/35", Fraction.calculateStringExp("(3'3/5 - 1'6/7) - (0 �� 1/2)").toString());
        assertEquals("0", Fraction.calculateStringExp("1'1/6 �� 5'1/7 �� 0 + 0").toString());
        assertEquals("1'17/114", Fraction.calculateStringExp("1'1/5 �� 3'4/5 + 4 - 3'1/6").toString());
        assertEquals("44/45", Fraction.calculateStringExp("4'8/9 �� 5 �� 1 �� 1").toString());
        assertEquals("65'1/3", Fraction.calculateStringExp("(5'1/3 + 0) �� (4'3/8 �� 2'4/5)").toString());
        assertEquals("2'4/7", Fraction.calculateStringExp("2 �� 3'1/2 + 2").toString());
        assertEquals("24'17/60", Fraction.calculateStringExp("1'1/5 + 5'2/3 �� 3'1/2 + 3'1/4").toString());
        assertEquals("5'7/12", Fraction.calculateStringExp("(4 - 2'1/4) + (4'5/6 - 1)").toString());
    }

}
```

### FractionMasterTest �������Ի����࣬���Ϸ��������Թ�һ����

```java
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value={
        FractionArithmeticTest.class,
        FractionConstructorTest.class,
        FractionS2FTest.class})
public class FractionMasterTest {
}
```

### ExerciseGeneratorTest ��������ʽ������

```java
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExerciseGeneratorTest {
    ExerciseGenerator exGen;

    public ExerciseGeneratorTest() {
        exGen = new ExerciseGenerator(10, 1000);
    }

    @Test
    public void fractionGeneratorTest() {
        Fraction f;
        for(int i = 0;i < 100;i++) {
            f = exGen.fractionGenerator();
            assertTrue(Fraction.string2Fraction("10/1").isGreaterThan(f));
            assertFalse(Fraction.string2Fraction("0/1").isGreaterThan(f));
        }
    }

    @Test
    public void opGeneratorTest() {
        int add = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        for(int i = 0;i < 100;i++) {
            switch(exGen.opGenerator()){
                case '+': add++; break;
                case '-': sub++; break;
                case '��': mul++; break;
                case '��': div++; break;
            }
        }
        assertTrue(sub > 0);
        assertTrue(add > 0);
        assertTrue(mul > 0);
        assertTrue(div > 0);
    }

    @Test
    public void oneOpGeneratorTest() {
        String[] ss;
        for(int i = 0;i < 100;i++) {
            ss = exGen.oneOpGenerator();
            for(String s:ss){
                System.out.println(s);
            }
            System.out.println();
        }
    }

    @Test
    public void twoOpGeneratorTest() {
        String[] ss;
        for(int i = 0;i < 100;i++) {
            ss = exGen.twoOpGenerator();
            for(String s:ss){
                System.out.println(s);
            }
            System.out.println();
        }
    }

    @Test
    public void threeOpGeneratorATest() {
        String[] ss;
        for(int i = 0;i < 100;i++) {
            ss = exGen.threeOpGeneratorA();
            for(String s:ss){
                System.out.println(s);
            }
            System.out.println();
        }
    }

    @Test
    public void threeOpGeneratorBTest() {
        String[] ss;
        for(int i = 0;i < 100;i++) {
            ss = exGen.threeOpGeneratorB();
            for(String s:ss){
                System.out.println(s);
            }
            System.out.println();
        }
    }

    @Test
    public void duplicateCheckTest() {
        String[] ss;
        int saveOne = 0;
        int saveTwo = 0;
        int saveThreeA = 0;
        int saveThreeB = 0;
        for(int i = 0;i < 100000;i++) {
            if(i < 1000) {
                ss = exGen.oneOpGenerator();
                if (exGen.duplicateCheck(ss[0])) {
                    System.out.println("���ǵ� " + (i + 1) + " ������ʽ");
                    for (String s : ss) {
                        System.out.println(s);
                    }
                    saveOne++;
                }
            }
            else if(i < 10000){
                ss = exGen.twoOpGenerator();
                if (exGen.duplicateCheck(ss[0])) {
                    System.out.println("���ǵ� " + (i + 1) + " ������ʽ");
                    for (String s : ss) {
                        System.out.println(s);
                    }
                    saveTwo++;
                }
            }
            else if(i < 50000){
                ss = exGen.threeOpGeneratorA();
                if (exGen.duplicateCheck(ss[0])) {
                    System.out.println("���ǵ� " + (i + 1) + " ������ʽ");
                    for (String s : ss) {
                        System.out.println(s);
                    }
                    saveThreeA++;
                }
            }
            else{
                ss = exGen.threeOpGeneratorB();
                if (exGen.duplicateCheck(ss[0])) {
                    System.out.println("���ǵ� " + (i + 1) + " ������ʽ");
                    for (String s : ss) {
                        System.out.println(s);
                    }
                    saveThreeB++;
                }
            }

        }
        System.out.println("һ�������� " + saveOne + " �� 1 �ͱ��ʽ");
        System.out.println("һ�������� " + saveTwo + " �� 2 �ͱ��ʽ");
        System.out.println("һ�������� " + saveThreeA + " �� 3A �ͱ��ʽ");
        System.out.println("һ�������� " + saveThreeB + " �� 3B �ͱ��ʽ");
    }

    @Test
    public void generateExpTest() {
        HashMap<String,String> result = exGen.generateExp();
        if(result != null) {
            System.out.println("�������ɵ���Ŀ�ʹ𰸹� " + result.size() + " ��");
            for(Map.Entry<String, String> entry: result.entrySet())
            {
                System.out.println("ʽ��: "+ entry.getKey()+ " ��: "+entry.getValue());
            }
        }
        else {
            System.out.println("range �� number ��ƥ��");
        }
    }
}
```

### UserInterfaceTest �����û��ӿ���

```java
import org.junit.Test;

public class UserInterfaceTest {
    @Test
    public void mainTest(){
        UserInterface.mainTest(new String[] {"-r","2","-n","2000"});
        UserInterface.mainTest(new String[] {"-r","1","-n","1"});
        UserInterface.mainTest(new String[] {"-r","10","-n","1000"});
        UserInterface.mainTest(new String[] {"-e","Exercise.txt","-a","Answer.txt"});
        UserInterface.mainTest(new String[] {"-e","ExercisesF.txt","-a","AnswersF.txt"});
    }
}
```

### MyAppMasterTest ���������ԣ�Ϊ�˼����븲����

```java
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value={
        FractionMasterTest.class,
        ExerciseGeneratorTest.class,
        UserInterfaceTest.class})
public class MyAppMasterTest {
}
```

![���븲����ͼ](resources/image2.jpg)
![����ͨ��ͼ](resources/image3.jpg)

������븲����Ϊ** 100% classes, 97% lines **

������ 10000 �� 10 ��Χ���ڵı��ʽ�ʹ�:

[����Ҳ鿴10000�����ʽ](resources/Exercises.txt)

[����Ҳ鿴10000����](resources/Answers.txt)

���ĸ�������Ŀ�ʹ�

[����鿴1000����Ŀ�����Ľ��](resources/Grade.txt)

## PSP

| PSP2.1                                  | Personal Software Process Stages        | Ԥ����ʱ�����ӣ� | ʵ�ʺ�ʱ�����ӣ� |
| --------------------------------------- | --------------------------------------- | ---------------- | ---------------- |
| Planning                                | �ƻ�                                    |                  |                  |
| �� Estimate                              | �� �������������Ҫ����ʱ��              | 30               | 60               |
| Development                             | ����                                    |                  |                  |
| �� Analysis                              | �� ������� (����ѧϰ�¼���)             | 45               | 75               |
| �� Design Spec                           | �� ��������ĵ�                          | 60               | 75               |
| �� Design Review                         | �� ��Ƹ��� (��ͬ���������ĵ�)         | 30               | 60               |
| �� Coding Standard                       | �� ����淶 (ΪĿǰ�Ŀ����ƶ����ʵĹ淶) | 30               | 45               |
| �� Design                                | �� �������                              | 90               | 120              |
| �� Coding                                | �� �������                              | 660              | 900              |
| �� Code Review                           | �� ���븴��                              | 60               | 90               |
| �� Test                                  | �� ���ԣ����Ҳ��ԣ��޸Ĵ��룬�ύ�޸ģ�  | 480              | 630              |
| Reporting                               | ����                                    |                  |                  |
| �� Test Report                           | �� ���Ա���                              | 45               | 60               |
| �� Size Measurement                      | �� ���㹤����                            | 30               | 20               |
| �� Postmortem & Process Improvement Plan | �� �º��ܽ�, ��������̸Ľ��ƻ�          | 45               | 40               |
| �ϼ�                                    |                                         | 1575             | 2175             |

## �ܽ�

�������ͬѧһ��������Ŀ��ʵ�֣�����Ҫ�������Ĺ�˼�ͱ�д�������ͬѧ��Ҫ������˼·�ĸ����Լ����ֻ�������ı�д���������ҵ���棬�����ͬѧ��Ҫ�����˷����� Fraction ��ʵ�֣�������Ҫ�����˱��ʽ������ ExerciseGenerator ��ʵ�֡���Ա���и��ô����������������໥���ĶԷ��Ĵ��룬���ٳ��ִ���ļ��ʡ�ͬʱ������������������ҵ��ʵ�֣�����˼·���ӿɿ�������Ŀ�еĲ�������Ҫ����������д������������һ�ε���ҵ��û�й���ع�ע���Ե����ݣ�����˴������������֮���bug����һ�Σ����Ƕ����еķ���ʹ�� junit �����˵�Ԫ���Ժ�������ԣ���֤�˴��븲�ǵ�ÿһ�У������쳣������Ȼ�����˺ܶ���������⡣�����ͬѧ�Ĵ����������Ǻ���ʵ�ģ�ÿ������������������ڶ�ʱ����ҹ���������ע�����ƵĴ��뷴�������������Ĺ���Ҳʮ����졣