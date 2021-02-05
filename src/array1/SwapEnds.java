package array1;

public class SwapEnds {

    public static int[] swapEnds(int[] nums) {

        // return data: int[]
        // param: int[]

        // how to get first element in array -->   nums[0];
        // how to get the last element in array--> nums[nums.length-1]


        if(nums.length <= 1) {
            return nums;
        }
        int temp = nums[0];             //must store nums[0] in a temp or it will be lost
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;

        return nums;

    }


}

/*
Given an array of ints, swap the first and last elements in the array.
Return the modified array. The array length will be at least 1.

swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */
