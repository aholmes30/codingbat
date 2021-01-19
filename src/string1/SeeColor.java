package string1;

public class SeeColor {
    public static String seeColor(String str) {

        // return data: String
        // param: String

        // starts with "red" -->
        if(str.startsWith("red")){
            return "red";
        }
        if(str.startsWith("blue")){
            return "blue";
        }
        return "";
    }


}

/*

Given a string, if the string begins with "red" or "blue" return that color string,
otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
 */
