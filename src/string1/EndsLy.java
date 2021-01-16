package string1;

public class EndsLy {

    public static boolean endsLy(String str) {

        return str.endsWith("ly");

    }

    public static void main(String[] args) {

        System.out.println(endsLy("perfectly"));
    }



}

/*
Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 */
