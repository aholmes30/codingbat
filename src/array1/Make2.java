package array1;

public class Make2 {

    public static int[] make2(int[] a, int[] b) {


        // return data: int[]
        // param: int[]

        // new array will be length 2
        // return as much as will fit --> elements in a and then elements from b --> so ALL
        // elements in a and then elements from b
        // how to get elements from a --> a[a.length]
        // elements from me -----? b[b.length]

        int[] newArr = new int[2];

        if(a.length == 0) {  // a is length 0
            newArr[0] = b[0];
            newArr[1] = b[1];
            return newArr;
        }
        if(a.length == 1 && b.length == 1){  // a and b are length 1
            newArr[0] = a[0];
            newArr[1] = b[0];
            return newArr;
        }
        if(a.length == 1) {   // a is length 1
            newArr[0] = a[0];
            newArr[1] = b[0];
        }
        else {
            newArr[0] = a[0];
            newArr[1] = a[1];

        }
        return newArr;
    }


}
/*
Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit,
 the elements from a followed by the elements from b. The arrays may be any length, including 0,
 but there will be 2 or more elements available between the 2 arrays.

make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
 */
