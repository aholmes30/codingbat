package warmup1;

public class BackAround {

    public String backAround(String str) {

        //return data: String
        //param: String

        String result = "";

        result = result + str.charAt(str.length()-1) + str + str.charAt(str.length()-1);

        return result;
    }



}

/*
Given a string, take the last char and return a new string with the last char
added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */
