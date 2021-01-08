package warmup1;

public class In1020 {

    public static boolean in1020(int a, int b) {

        //return data: boolean
        //param: int

        return a >= 10 && a <= 20 || a >= 10 && b <= 20;

    }

    public static void main(String[] args) {

        System.out.println(in1020(4, 8));
    }
}

/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
 */
