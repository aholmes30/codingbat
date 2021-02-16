package warmup2;

public class StringX {
    public static String stringX(String str) {

        // return data: String
        // param: String

        // for loop to iterate through string and find out if x is at beg or end
        // iterate through and find x's that are not at beg or end and return the string
        // without them

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(!(i > 0 && i < str.length()-1 && str.charAt(i) == 'x')) { //check the string except from first char and last char
                result = result + str.charAt(i);
            }
        }
        return result;
    }


}

/*

Given a string, return a version where all the "x" have been removed.
Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */
