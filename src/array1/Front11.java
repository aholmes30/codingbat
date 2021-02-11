package array1;

public class Front11 {

    public static int[] front11(int[] a, int[] b) {

        // return data: int[]
        //param: int[] a and int[] b

        if(a.length == 0 && b.length == 0) {
            return a;
        }
        if(a.length == 0){
            int[] newArr = {b[0]};
            return newArr;

        }
        if(b.length == 0) {
            int[] newArr = {a[0]};
            return newArr;
        }
        int[] newArr = {a[0], b[0]};
        return newArr;
    }



}

/*

Given 2 int arrays, a and b, of any length, return a new array with the first
element of each array. If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
 */
