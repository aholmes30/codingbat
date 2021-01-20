package string1;

public class WithOut2 {

    public static String without2(String str) {

        // return data: String
        // param: String

        // if substring length two is same at beg and end -->
        // str.substring(0, 2) = str.substring(str.length()-2, str.length()-1)

        if(str.length() == 2) {
            return "";
        }
        if(str.length() < 2){
            return str;
        }
        if(str.substring(0, 2).equals(str.substring(str.length()-2, str.length())))
            return str.substring(2, str.length());

        else return str;
    }

    public static void main(String[] args) {
        System.out.println(without2("HelloHi"));
    }
}

/*
Given a string, if a length 2 substring appears at both its beginning and end,
return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") →
 */
