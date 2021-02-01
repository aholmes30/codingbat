package array1;

public class MiddleWay {

    public static int[] middleWay(int[] a, int[] b) {

        // return data: int[]
        // param: int[]

        // create new array using middle part of array a and array b
        // middle of a --> a[1]
        // middle of b --> b[1]

        int[] newArr = new int[2];
        newArr[0] = a[1];
        newArr[1] = b[1];

        return newArr;

    }

}

/*
Given 2 int arrays, a and b, each length 3, return a new array length 2
containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */
