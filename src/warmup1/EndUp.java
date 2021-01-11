package warmup1;

public class EndUp {

    public String endUp(String str) {

        //return data: String
        //param: String

        if(str.length() <= 3){
            return str.toUpperCase();
        }
        return str.substring(0, str.length()-3) + str.substring(str.length()-3).toUpperCase();
    }

}

/*
Given a string, return a new string where the last 3 chars are now in upper case. I
f the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase()
returns the uppercase version of a string.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */
