package array1;

public class Sum2 {

    public static int sum3(int[] nums) {

        // return data: int
        // param: int[]

        return nums[0] + nums[1] + nums[2];


    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 6, 7};
        System.out.println(sum3(nums));
    }
}

/*

Given an array of ints length 3, return the sum of all the elements.

sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
 */
