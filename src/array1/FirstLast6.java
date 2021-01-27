package array1;

public class FirstLast6 {

    public static boolean firstLast6(int[] nums) {

        // return data: boolean
        // param: int[]

        return nums[0] == 6 || nums[nums.length-1] == 6;

    }

    public static void main(String[] args) {

        int[] nums = {9, 0, 5, 6};

        System.out.println(firstLast6(nums));
    }

}

/*
Given an array of ints, return true if 6 appears as either the first or last
element in the array. The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
 */
