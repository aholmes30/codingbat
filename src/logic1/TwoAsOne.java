package logic1;

public class TwoAsOne {

    public static boolean twoAsOne(int a, int b, int c) {

        // return data: boolean
        // param: int

        return (a + b == c) || (a + c == b) || (c + b == a);

    }

    public static void main(String[] args) {
        System.out.println(twoAsOne(8, 3, 13));
    }


}

/*
Given three ints, a b c, return true if it is possible to add two of
the ints to get the third.

twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
 */
