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
