package warmup1;

public class MixStart {
    public static boolean mixStart(String str) {

        // return data: boolean
        // param: String

        if(str.length() >= 3 && str.substring(1, 3).equals("ix")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(mixStart("tix snacks"));
    }


}

/*

Return true if the given string begins with "mix", except the 'm'
can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */
