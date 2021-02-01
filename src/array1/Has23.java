package array1;

public class Has23 {

    public static boolean has23(int[] nums) {

        // return data: boolean
        // param: int


        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 2 || nums[i] == 3)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {3, 45, 1, 78, 89};
        System.out.println(has23(nums));
    }

}

/*

Given an int array length 2, return true if it contains a 2 or a 3.

has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
 */
