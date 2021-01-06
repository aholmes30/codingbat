package warmup1;

public class FrontBack {

    public String frontBack(String str) {

        // return data: String
        // param: String

        if(str.length() <= 1) {
            return str;
        }

        String mid = str.substring(1, str.length()-1); //find mid after 0

        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }


}

/*

Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

 */
