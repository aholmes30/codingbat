package array1;

import java.util.Arrays;

public class MidThree {
    public static int[] midThree(int[] nums) {

        // return data: int[]
        // param: int[]

        int[] newArr = new int[3];       // create array that will hold three elements
        int middle = nums.length / 2;    // store middle of nums array as variable

        newArr[0] = nums[middle - 1];
        newArr[1] = nums[middle];
        newArr[2] = nums[middle + 1];

        return newArr;


    }

    public static void main(String[] args) {
        int[] nums = {8, 9, 10};
        System.out.println(Arrays.toString(midThree(nums)));
    }

}

/*

Given an array of ints of odd length, return a new array length 3 containing
the elements from the middle of the array. The array length will be at least 3.

midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
Go...Save
 */
