import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        // 10 Valid
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("IX"), 9);
        assertEquals(RomanToDecimal.romanToDecimal("XII"), 12);
        assertEquals(RomanToDecimal.romanToDecimal("MCMIV"), 1904);
        assertEquals(RomanToDecimal.romanToDecimal("LXI"), 61);
        assertEquals(RomanToDecimal.romanToDecimal("CCL"), 250);
        assertEquals(RomanToDecimal.romanToDecimal("LIX"), 59);
        assertEquals(RomanToDecimal.romanToDecimal("XX"), 20);
        assertEquals(RomanToDecimal.romanToDecimal("DCI"), 601);
        assertEquals(RomanToDecimal.romanToDecimal("MDCIV"), 1604);

        // 4 logically incorrect
        assertEquals(RomanToDecimal.romanToDecimal("XVVVI"), 26);
        assertEquals(RomanToDecimal.romanToDecimal("IIIIIII"), 7);
        assertEquals(RomanToDecimal.romanToDecimal("CIIX"), 110);
        assertEquals(RomanToDecimal.romanToDecimal("MCIVIV"), 1110);

       // 4 invalid
        assertEquals(RomanToDecimal.romanToDecimal("Hutz"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("Levi"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("Y"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("good-bye"), -1);
    }
}