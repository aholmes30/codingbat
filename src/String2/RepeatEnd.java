package String2;

public class RepeatEnd {

    public static String repeatEnd(String str, int n) {

        // return data: String
        // param: String, int

        // 1. need the last n chars
        // 2. need a way to repeat and store the last n chars an n amount of times

        String lastN = str.substring(str.length()-n);  // starting index of our last n chars
        String total = "";

        for(int i = 0; i < n; i++) {
            total = total + lastN;      // ad total to lastN
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(repeatEnd("doggo", 4));
    }

}

/*

Given a string and an int n, return a string made of n repetitions of the last n
characters of the string. You may assume that n is between 0 and the length of the
string, inclusive.

repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
 */
