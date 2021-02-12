package warmup2;

public class FrontTimes {

    public static String frontTimes(String str, int n) {

        // return data: String
        // param: String, int

        // return the front of the string (3 chars) n times
        // if length is less than 3, return whatever is there n times

        String temp = "";
        for(int i = 0; i < n; i++) {
            if(str.length() >= 3) {
                temp = temp + str.substring(0, 3);
            }
            else {
                temp += str;
            }
        }
        return temp;
    }


}

/*
Given a string and a non-negative int n, we'll say that the front of the string is
the first 3 chars, or whatever is there if the string is less than length 3.
Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
Go...Save, C
 */
