package array1;

import java.util.Arrays;

public class PlusTwo {

    public static int[] plusTwo(int[] a, int[] b) {

        // return data: int[]
        // param: int[]

        int[] ab = {a[0], a[1], b[0], b[1]};
        return ab;
    }

    public static void main(String[] args) {
        int[] a = {5, 6};
        int[] b = {8, 9};

        System.out.println(Arrays.toString(plusTwo(a, b)));
    }
}

/*
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */
