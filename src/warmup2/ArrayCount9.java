package warmup2;

public class ArrayCount9 {

    public static int arrayCount9(int[] nums) {

        // return data: int
        // param: int[]

        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 9)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 9, 9, 9};
        System.out.println(arrayCount9(nums));
    }

}

/*
Given an array of ints, return the number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */
