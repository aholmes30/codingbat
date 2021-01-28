package array1;

public class CommonEnd {

    public static boolean commonEnd(int[] a, int[] b) {

        // return data: boolean
        // param: int[]

        // first element of a and b --> a[0], b[0]
        // last element of a and b --> a[a.length-1], [b.length-1]

        if(a[0] == b[0] || a[a.length-1] == b[b.length-1]) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {9, 90, 6, 5};
        int[] b = {4, 1, 6, 77};
        System.out.println(commonEnd(a, b));
    }


}

/*
Given 2 arrays of ints, a and b, return true if they have the same first element
or they have the same last element. Both arrays will be length 1 or more.

commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
 */


