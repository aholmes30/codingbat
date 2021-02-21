package String2;

public class DoubleChar {

    public static String doubleChar(String str) {

        // return data: String
        // param: String

        //1. create a String temp variable
        //2. for loop so iterate through the String
        //3. add another char to original char into String temp for each iteration
        //4. return String temp

        String temp = "";

        for(int i = 0; i < str.length(); i++) {
            temp += str.charAt(i);
            temp += str.charAt(i);
        }

        return temp;

    }

}

/*

Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */
