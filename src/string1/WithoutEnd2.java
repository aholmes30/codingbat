package string1;

public class WithoutEnd2 {

    public static String withouEnd2(String str) {

        //return data: String
        //param: String

        // first char would be: str.substring(0, 1);
        // last char would be: str.substring(str.lengnth()-1);



        if(str.length() <= 1){
            return "";
        }
        return str.substring(1, str.length()-1);

    }

    public static void main(String[] args) {

        System.out.println(withouEnd2("Hey There"));
    }

}

/*

Given a string, return a version without both the first and last char of the string.
The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 */
