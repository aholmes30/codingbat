package array1;

import java.util.Arrays;

public class BiggerTwo {
    public static int[] biggerTwo(int[] a, int[] b) {

        // return data: int[]
        // param: int[]


        if(a[0] + a[1] == b[0] + b[1]){
            return a;
        }
        if(a[0] + a[1] > b[0] + b[1]) {
            return a;
        }
        else return b;
    }

    public static void main(String[] args) {
        int a[] = {5, 6};
        int b[] = {6, 4};
        System.out.println(Arrays.toString(biggerTwo(a, b)));
    }

}

/*

Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each
array. Return the array which has the largest sum. In event of a tie, return a.

biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
 */