package string1;

public class WithoutX {
    public static String withoutX(String str) {

        //return data: String
        //param: String

        if (str.length() == 0) {
            return str;
        }
        if (str.length() == 1) {
            if (str.charAt(0) == 'x')
                return "";
            else
                return str;
        }

        if (str.charAt(0) == ('x')) {
            str = str.substring(1, str.length());
        }

        if (str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;

    }

}


/*

Given a string, if the first or last chars are 'x', return the string without
those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */