package String2;

public class RepeatFront {

    public static String repeatFront(String str, int n) {

        // return data: String
        // param: string, int

        String total = "";

        for(int i = n; n > 0; n--){
            total = total + str.substring(0, n);
        }
        return total;
    }

}

/*
Given a string and an int n, return a string made of the first n characters of the string,
followed by the first n-1 characters of the string, and so on. You may assume that n is between
0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
 */
