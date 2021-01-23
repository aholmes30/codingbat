package logic1;

public class SortaSum {

    public static int sortaSum(int a, int b) {

        // return data: int
        // param: int

        if(a + b >= 10 && a + b <= 19) {
            return 20;
        }
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(sortaSum(10, 15));
    }
}

/*

Given 2 ints, a and b, return their sum. However, sums in the range 10..19
inclusive, are forbidden, so in that case just return 20.

sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21
 */
