package string1;

public class TheEnd {

    public static String theEnd(String str, boolean front) {

        //return data: String
        //param: String boolean

        if(front){
            return str.substring(0, 1); //just return string length 1 from front
        }

        return str.substring(str.length()-1);  //return string length 1 from back

    }

    public static void main(String[] args) {

        System.out.println(theEnd("hey", true));
    }



}

/*

Given a string, return a string length 1 from its front, unless front is false,
in which case return a string length 1 from its back. The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
 */
