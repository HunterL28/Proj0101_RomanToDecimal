/**
 * Project turning roman numbers into decimal values and including logically incorrect decimal values
 * @author 24levinson
 * @version 10.13.2022
 */
public class RomanToDecimal {
    /**
     * Method that converts roman numbers to a decimal value with a few invariants included
     *
     * @param roman represents a string of roman numerals
     * @return a decimal value
     */
    public static int romanToDecimal(String roman) {
        int sum = 0;
        // convert to all one case
        roman = roman.toUpperCase();
        //"XI".length => 2
        // "MCMLXII".length() => 7
        //  0123456
        // "HAHA" ==> -1
        // string.length()
        // array.length
        // list.size()
        for (int i = 0; i < roman.length(); i++) {
            if (roman.charAt(i) == 'I')
                sum += 1;
            else if (roman.charAt(i) == 'V')
                sum += 5;
            else if (roman.charAt(i) == 'X')
                sum += 10;
            else if (roman.charAt(i) == 'L')
                sum += 50;
            else if (roman.charAt(i) == 'C')
                sum += 100;
            else if (roman.charAt(i) == 'D')
                sum += 500;
            else if (roman.charAt(i) == 'M')
                sum += 1000;
            else
                return -1;
        }
        // Invariants
        if (roman.indexOf("IV") != -1)
            sum -= 2;
        if (roman.indexOf("IX") != -1)
            sum -= 2;
        if (roman.indexOf("XL") != -1)
            sum -= 20;
        if (roman.indexOf("XC") != -1)
            sum -= 20;
        if (roman.indexOf("CD") != -1)
            sum -= 200;
        if (roman.indexOf("CM") != -1)
            sum -= 200;
        return sum;
    }

    private static String decimalToRoman(int decimal) {
        String roman2 = "";
        while (decimal >= 1000) {
            roman2 += "M";
            decimal -= 1000;
        }
        while (decimal >= 900) {
            roman2 += "CM";
            decimal -= 900;
        }
        while (decimal >= 500) {
            roman2 += "D";
            decimal -= 500;
        }
        while (decimal >= 400) {
            roman2 += "CD";
            decimal -= 400;
        }
        while (decimal >= 100) {
            roman2 += "C";
            decimal -= 100;
        }
        while (decimal >= 90) {
            roman2 += "XC";
            decimal -= 90;
        }
        while (decimal >= 50) {
            roman2 += "L";
            decimal -= 50;
        }
        while (decimal >= 40) {
            roman2 += "XL";
            decimal -= 40;
        }
        while (decimal >= 10) {
            roman2 += "X";
            decimal -= 10;
        }
        while (decimal >= 9) {
            roman2 += "IX";
            decimal -= 9;
        }
        while (decimal >= 5) {
            roman2 += "V";
            decimal -= 5;
        }
        while (decimal >= 4) {
            roman2 += "IV";
            decimal -= 4;
        }
        while (decimal >= 1) {
            roman2 += "I";
            decimal -= 1;
        }
        return roman2;
    }


    /**
     * Main method of class RomanToDecimal
     * @param args command line arguments, if needed.
     */
    public static void main(String[] args) {
        for(String roman : args)    {       // for-each
            int decimal = romanToDecimal(roman);
            if(decimal != -1) {
                if(roman.toUpperCase().equals(decimalToRoman(decimal)))
                    System.out.println("Input: " + roman + " => output: " + decimal);
                else
                    System.out.println("Input: " + roman + " => output: " + decimal + " which is logically incorrect");
            }
            else
                System.out.println("Input: " + roman + " => output: invalid");
        }
    }
}
