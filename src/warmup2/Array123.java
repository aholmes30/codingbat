package warmup2;

public class Array123 {

    public static boolean array123(int[] nums) {

        // return data: boolean
        // param: int[]

        // create for loop to iterate through array
        // search for sequence of 1, 2 and 3 and return true is found

        for(int i = 0; i < nums.length-2; i++) {
            if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3)
                return true;
        }
        return false;
    }


}

/*

Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the
array somewhere.

array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */
