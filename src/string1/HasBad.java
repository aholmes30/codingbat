package string1;

public class HasBad {

    public static boolean hasBad(String str) {

        // return data: boolean
        // param: String

        // how to check if "bad" starts at index 0: str.startsWith("bad")

        if(str.startsWith("bad")) {
            return true;
        }

        if(str.length() > 0 && str.substring(1).startsWith("bad")){
            return true;
        }
        return false;
    }



}

/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
Note: use .equals() to compare 2 strings.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
 */
