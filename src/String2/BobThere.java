package String2;

public class BobThere {

    public static boolean bobThere(String str) {

        // return data: boolean
        // param: String

        // use a for loop to iterate through string and look for b_b

        for(int i = 0; i < str.length()-2; i++){
            if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b')
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(bobThere("bob the builder bob bob bob"));
    }

}

/*
Return true if the given string contains a "bob" string, but where the middle 'o'
char can be any char.

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
 */

