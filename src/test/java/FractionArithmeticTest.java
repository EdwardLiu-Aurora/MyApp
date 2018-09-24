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
        assertEquals("60'43/60", Fraction.calculateStringExp("(4/5 + 3'1/4) + (8'8/9 × 6'3/8)").toString());
        assertEquals("0", Fraction.calculateStringExp("(1 × 0) ÷ (6 + 3/8)").toString());
        assertEquals("49'205/294", Fraction.calculateStringExp("2'5/7 × (3'1/2 + (6'1/7 + 8'2/3))").toString());
        assertEquals("5'1/10", Fraction.calculateStringExp("3'2/3 × 3 - 1'1/2 - 4'2/5").toString());
        assertEquals("0", Fraction.calculateStringExp("(4'1/2 - (1/2 + 4)) × 0").toString());
        assertEquals("1", Fraction.calculateStringExp("(5/7 + 1'1/4) - (1'5/7 - 3/4)").toString());
        assertEquals("196/375", Fraction.calculateStringExp("4'1/5 × ((4/5 - 1/3) ÷ 3'3/4)").toString());
        assertEquals("3/7", Fraction.calculateStringExp("(1'3/4 × 1'1/3) ÷ (3'4/9 + 2)").toString());
        assertEquals("15'7/9", Fraction.calculateStringExp("2 × (4'8/9 + 3) - 0").toString());
        assertEquals("23/35", Fraction.calculateStringExp("(1 + 5'4/7) ÷ (4 × 2'1/2)").toString());
        assertEquals("10/107", Fraction.calculateStringExp("1 ÷ (2'3/4 + 2'3/5) × 1/2").toString());
        assertEquals("1'1/42",Fraction.calculateStringExp("2'6/7 - 2'2/3 - 1/6 + 1").toString());
        assertEquals("1'26/35", Fraction.calculateStringExp("(3'3/5 - 1'6/7) - (0 × 1/2)").toString());
        assertEquals("0", Fraction.calculateStringExp("1'1/6 × 5'1/7 × 0 + 0").toString());
        assertEquals("1'17/114", Fraction.calculateStringExp("1'1/5 ÷ 3'4/5 + 4 - 3'1/6").toString());
        assertEquals("44/45", Fraction.calculateStringExp("4'8/9 ÷ 5 × 1 ÷ 1").toString());
        assertEquals("65'1/3", Fraction.calculateStringExp("(5'1/3 + 0) × (4'3/8 × 2'4/5)").toString());
        assertEquals("2'4/7", Fraction.calculateStringExp("2 ÷ 3'1/2 + 2").toString());
        assertEquals("24'17/60", Fraction.calculateStringExp("1'1/5 + 5'2/3 × 3'1/2 + 3'1/4").toString());
        assertEquals("5'7/12", Fraction.calculateStringExp("(4 - 2'1/4) + (4'5/6 - 1)").toString());
    }

}
