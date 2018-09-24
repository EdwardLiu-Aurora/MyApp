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
                case '×': mul++; break;
                case '÷': div++; break;
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
                    System.out.println("这是第 " + (i + 1) + " 个算术式");
                    for (String s : ss) {
                        System.out.println(s);
                    }
                    saveOne++;
                }
            }
            else if(i < 10000){
                ss = exGen.twoOpGenerator();
                if (exGen.duplicateCheck(ss[0])) {
                    System.out.println("这是第 " + (i + 1) + " 个算术式");
                    for (String s : ss) {
                        System.out.println(s);
                    }
                    saveTwo++;
                }
            }
            else if(i < 50000){
                ss = exGen.threeOpGeneratorA();
                if (exGen.duplicateCheck(ss[0])) {
                    System.out.println("这是第 " + (i + 1) + " 个算术式");
                    for (String s : ss) {
                        System.out.println(s);
                    }
                    saveThreeA++;
                }
            }
            else{
                ss = exGen.threeOpGeneratorB();
                if (exGen.duplicateCheck(ss[0])) {
                    System.out.println("这是第 " + (i + 1) + " 个算术式");
                    for (String s : ss) {
                        System.out.println(s);
                    }
                    saveThreeB++;
                }
            }

        }
        System.out.println("一共保留了 " + saveOne + " 个 1 型表达式");
        System.out.println("一共保留了 " + saveTwo + " 个 2 型表达式");
        System.out.println("一共保留了 " + saveThreeA + " 个 3A 型表达式");
        System.out.println("一共保留了 " + saveThreeB + " 个 3B 型表达式");
    }

    @Test
    public void generateExpTest() {
        HashMap<String,String> result = exGen.generateExp();
        if(result != null) {
            System.out.println("最终生成的题目和答案共 " + result.size() + " 对");
            for(Map.Entry<String, String> entry: result.entrySet())
            {
                System.out.println("式子: "+ entry.getKey()+ " 答案: "+entry.getValue());
            }
        }
        else {
            System.out.println("range 和 number 不匹配");
        }
    }
}
