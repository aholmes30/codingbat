package string1;

public class MinCat {

    public static String minCat(String a, String b) {

        // return data: String
        // param: String

        // not same length --> omit chars from longer string so it is same length as shorter
        if(a.length() > b.length()){
            int diff = a.length() - b.length();
            return a.substring(diff, a.length()) + b;
        }
        if(b.length() > a.length()) {
            int diff = b.length() - a.length();
            return a + b.substring(diff, b.length());
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(minCat("Hey there", "Java"));
    }
}

/*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths, omit chars from the longer string so it is
the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
 */
