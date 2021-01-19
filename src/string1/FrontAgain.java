package string1;

public class FrontAgain {

    public static boolean frontAgain(String str) {

        // return data: boolean
        // param: String

        if(str.length() >= 2){
            return str.substring(0, 2).equals(str.substring(str.length()-2));
        }
        return false;
    }

}

/*
Given a string, return true if the first 2 chars in the string also appear at the
end of the string, such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
 */
