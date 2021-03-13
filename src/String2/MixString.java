package String2;

public class MixString {
    public static String mixString(String a, String b) {

        // return data: String
        // param: String

        // bigger string:
        // first char of a: a.substring(0, 1)
        // first char of b: b.substring(0, 1)
        // second char of a: a.substring(1, 2);
        // second char of b: b.substring(1, 2);

        // use a for loop

        int min = Math.min(a.length(), b.length());  // find shorter string length
        int x = 0;  // counting variable
        String total = "";  // holds all the chars from a and b

        while(x < min) {
            String aSubstring = a.substring(x, x +1);
            String bSubstring = b.substring(x, x +1);   // these are holding the chars from substring to next
            total = total + aSubstring + bSubstring;
            x++;
        }
        return total + a.substring(x) + b.substring(x);
    }

//  mixString("abc", "xyz") → "axbycz"


}

/*
Given two strings, a and b, create a bigger string made of the first char of a, the first
char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the
end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */
