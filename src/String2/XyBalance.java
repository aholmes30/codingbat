package String2;

public class XyBalance {

    public static boolean xyBalance(String str) {

        // return data: boolean
        // param: String

        // xy balanced if: for all the 'x' chars, there is a y in the string after
        // ex. xyBalance("aaxbby") → true --> there is an 'x' and a 'y' following later
        // ex. xyBalance("yaaxbb") → false --> there is a 'y' FIRST, so it does not follow the x
        // use lasIndexOf() method

        int lastX = str.lastIndexOf('x');
        int lastY = str.lastIndexOf('y');

        return lastX <= lastY; // only return true is the last x char index position is less than
        // or equal to the last y char index position

    }



}

/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there
exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */
