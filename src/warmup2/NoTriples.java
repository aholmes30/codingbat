package warmup2;

public class NoTriples {
    public static boolean noTriples(int[] nums) {

        // return data: boolean
        // param: int[]

        // a triple would be like: nums[i] == nums[i+1] && nums[i + 2];

        for(int i = 0; i < nums.length-2; i++){
            int first = nums[i];
            if(nums[i + 1] == first && nums[i + 2] == first)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 7, 7, 8, 9};
        System.out.println(noTriples(nums));
    }
}

/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a
row in the array. Return true if the array does not contain any triples.

noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */