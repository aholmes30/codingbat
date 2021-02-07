package array1;

public class Unlucky {

    public static boolean unlucky1(int[] nums) {

        // return data: boolean
        // param: int[]

        // a 1 followed by a 3 is "unlucky" --> nums[i] == 1 && nums(nums[i + 1]) == 3
        // unlucky 1 has to be in the first 2 or last 2 positions in the array
        // first two --> nums[0] or nums[1]
        // last two --> nums[nums.length-1] and nums[nums.length-2]

        if(nums.length == 0 || nums.length == 1)
            return false;

        if(nums[0] == 1 && nums[1] == 3)
            return true;

        if(nums[1] == 1 && nums[2] == 3)
            return true;

        if(nums[nums.length-2] == 1 && nums[nums.length-1] == 3)
            return true;

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 1, 1, 3};
        System.out.println(unlucky1(nums));
    }
}

/*
We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false
 */