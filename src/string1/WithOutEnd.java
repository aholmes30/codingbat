package string1;

public class WithOutEnd {

    public String withoutEnd(String str) {

        //return data: String
        //param: String

        //how to get first char: str.substring(0,1)
        //how to get last char: str.substring(str.length()-1)

        return str.substring(1, str.length()-1);

    }
}

/*

Given a string, return a version without the first and last char,
so "Hello" yields "ell". The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
 */
