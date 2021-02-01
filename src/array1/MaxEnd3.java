package array1;

import java.util.Arrays;

public class MaxEnd3 {

    public static int[] maxEnd3(int[] nums) {

        // return data: int[]
        // param: int[]

        // array is length 3

        if(nums[0] >= nums[nums.length-1]) {
            nums[0] = nums[0];
            nums[1] = nums[0];
            nums[2] = nums[0];
        }
        else if(nums[0] <= nums[nums.length-1]) {
            nums[0] = nums[nums.length-1];
            nums[1] = nums[nums.length-1];
            nums[2] = nums[nums.length-1];
        }

        return new int[] {nums[0], nums[1], nums[2]};

    }

    public static void main(String[] args) {
        int[] nums = {5, 78, 23, 45, 99};
        System.out.println(Arrays.toString(maxEnd3(nums)));
    }

}

/*

Given an array of ints length 3, figure out which is larger, the first
or last element in the array, and set all the other elements to be that value.
Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
 */