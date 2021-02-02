package array1;

public class No23 {

    public static boolean no23(int[] nums) {

        // return data: boolean
        // param: int[] nums

        return nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3;
    }

    public static void main(String[] args) {
        int[] nums = {5, 34};
        System.out.println(no23(nums));
    }
}

/*

Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 */
