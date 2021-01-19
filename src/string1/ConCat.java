package string1;

public class ConCat {

    public static String conCat(String a, String b) {

        //return data: String
        //param: String

        // take care of double chars:

        if(a.length() == 0 || b.length() == 0){
            return a + b;
        }
        if(a.substring(a.length()-1).equals(b.substring(0, 1))){
            return a.substring(0) + b.substring(1);
        }
        return a + b;
    }



}

/*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars, so "abc"
and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
 */
