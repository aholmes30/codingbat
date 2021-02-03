package array1;

public class Start1 {
    public static int start1(int[] a, int[] b) {

        // return data: int
        // param = int[]

        int count = 0;

        if(a.length > 0 && a[0] == 1){
            count++;
        }
        if(b.length > 0 && b[0] == 1){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {7, 9, 45, 8};
        int[] b = {3, 5, 6};
        System.out.println(start1(a, b));
    }
}

/*
Start with 2 int arrays, a and b, of any length.
Return how many of the arrays have 1 as their first element.

start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
 */
