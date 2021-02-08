package warmup2;

public class StringTimes {

    public static String stringTimes(String str, int n) {


        // return data: String
        // param: String, int

        String temp = "";

        for(int i = 0; i < n; i++) {
            temp = temp + str;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(stringTimes("hello", 4));
    }

}

/*
Given a string and a non-negative int n, return a larger string that is n copies
of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
