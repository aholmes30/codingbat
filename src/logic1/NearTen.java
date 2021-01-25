package logic1;

public class NearTen {

    public static boolean nearTen(int num) {
        // return data: boolean
        // param: int

        if(num % 10 < 3 || num % 10 >= 8 ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(nearTen(56));
    }
}

/*
Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
See also: Introduction to Mod

nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
 */
