package logic1;

public class TeenSum {

    public static int teenSum(int a, int b) {

        // return data: int
        // param: int

        if(a <= 19 && a >= 13 || b <= 19 && b >= 13){
            return 19;
        }
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(teenSum(13, 21));
    }
}

/*

Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19
inclusive, are extra lucky. So if either value is a teen, just return 19.

teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
 */
