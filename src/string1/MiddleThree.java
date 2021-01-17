package string1;

public class MiddleThree {
    public static String middleThree(String str) {

        // return data: String
        // param: String

        // how to get string length 3 --> str.substring(0, 3)

        int middle = str.length() / 2;

        return str.substring(middle - 1, middle + 2);
        // Candy --> middle - 1 (start at n then substract 1 so a THEN add 2, so "and");


    }

}

/*

Given a string of odd length, return the string length 3 from its middle, s
o "Candy" yields "and". The string length will be at least 3.

middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
 */


