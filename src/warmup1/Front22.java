package warmup1;

public class Front22 {

    public static String front22(String str) {

        //return data: String
        //param: String

        if(str.length() < 2) {
            return str.substring(0) + str.substring(0) + str.substring(0);
        }

        //get the first two chars:

        String firstTwo = str.substring(0, 2);

        String result = "";

        result = result + firstTwo + str + firstTwo;

        return result;


    }

    public static void main(String[] args) {

        System.out.println((front22("doggy")));
    }

}

/*

Given a string, take the first 2 chars and return the string with the 2 chars added
at both the front and back, so "kitten" yields"kikittenki". If the string length is
less than 2, use whatever chars are there.


front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */
