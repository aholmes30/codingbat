package warmup2;

public class ArrayFront9 {

    public static boolean arrayFront9(int[] nums) {

        // return data: boolean
        // param: int[]

        // check to see if one of the first FOUR elements = 9 and return true if so


        int end = nums.length;
        if (end > 4)
            end = 4;

        for(int i = 0; i < end; i++) {
            if(nums[i] == 9){
                return true;
            }
        }
        return false;
    }


}

/*
Given an array of ints, return true if one of the first 4 elements in the array
is a 9. The array length may be less than 4.

arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 */
