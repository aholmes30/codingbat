package logic1;

public class More20 {

    public static boolean more20(int n) {

        // return data: boolean
        // param: int

        return (n % 20 == 0 + 1 || n % 20 == 0 + 2);

    }


    public static void main(String[] args) {

        System.out.println(more20(67));
        System.out.println(more20(22));
    }
}

/*

Return true if the given non-negative number is 1 or 2 more than a
multiple of 20. See also: Introduction to Mod


more20(20) → false
more20(21) → true
more20(22) → true
 */