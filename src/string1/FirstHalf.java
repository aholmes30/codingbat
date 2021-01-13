package string1;

public class FirstHalf {

    public static String firstHalf(String str) {

        //return data: String
        //param: String

        return str.substring(0, str.length()/2);

    }

    public static void main(String[] args) {
        System.out.println(firstHalf("baddog"));
    }

}

/*

Given a string of even length, return the first half.
So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */
