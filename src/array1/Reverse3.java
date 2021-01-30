package array1;

import java.util.Arrays;

public class Reverse3 {

    public static int[] reverse3(int[] nums) {

        // return data: int[]
        // param: int[]

        int[] reversedNums = {nums[2], nums[1], nums[0]};
        return reversedNums;

    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 3, 8, 9};
        System.out.println(Arrays.toString(reverse3(nums)));
    }
}

/*

Given an array of ints length 3, return a new array with the elements in
reverse order, so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
 */