package warmup1;

public class Makes10 {

    public boolean makes10(int a, int b) {

        //return data: boolean
        //param: int

        if(a == 10 || b == 10) {
            return true;
        }
        if(a + b == 10) {
            return true;
        }
        return false;
    }


}

/*
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
 */
