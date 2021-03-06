package array1;

public class MaxTriple {

    public static int maxTriple(int[] nums) {

        // return data: int
        // param: int[]

        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length-1];

        if(first > middle && first > last) {
            return first;
        }
        if(middle > first && middle > last) {
            return middle;
        }
        return last;
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 19};
        System.out.println(maxTriple(nums));
    }

}

/*
Given an array of ints of odd length, look at the first, last, and middle values in
the array and return the largest. The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
 */
