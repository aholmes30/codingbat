package warmup2;

public class CountXX {

    public static int countXX(String str) {

        // return value: int
        // param: String

        int xxCount = 0;

        for(int i = 0; i < str.length()-1; i++) {
            if(str.substring(i, i + 2).equals("xx"))
                xxCount++;
        }
        return xxCount;
    }

    public static void main(String[] args) {
        System.out.println(countXX("Hellxxo there"));
    }

}

/*
Count the number of "xx" in the given string. We'll say that overlapping is
allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */
