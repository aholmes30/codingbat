package warmup1;

public class MissingChar {

    public static String missingChar(String str, int n) {
        // return data: String
        // param: str, int

        return str.substring(0, n) + str.substring(n+1);
        // start at 0, then go to n and ADD from n to + 1

    }

    public static void main(String[] args) {

        System.out.println(missingChar("banana", 2));
    }

}

/*
Given a non-empty string and an int n, return a new string where the char at
index n has been removed. The value of n will be a valid index of a char in the
original string (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 */
