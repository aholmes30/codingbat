package array1;

import java.util.Arrays;

public class FrontPiece {

    public static int[] frontPiece(int[] nums) {

        // return data: int[]
        // param: int[]

        if(nums.length < 2) {
            return nums;
        }
        int[] newArr = {nums[0], nums[1]};

        return newArr;
    }

    public static void main(String[] args) {
        int[] nums = {6, 3, 45, 67};
        System.out.println(Arrays.toString(frontPiece(nums)));
    }

}

/*
Given an int array of any length, return a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.

frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
 */
