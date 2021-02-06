package logic1;

public class GreenTicket {

    public static int greenTicket(int a, int b, int c) {

        // return data: int
        // param: int

        // nums are all diff from eachother --> return 0
        // nums are all same --> return 20
        // two of nums are same, return 10

        if(a == b && b == c){
            return 20;
        }
        if(a == b || b == c || a == c){
            return 10;
        }
        return 0;
    }


}

/*
You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all
different from each other, the result is 0. If all of the numbers are the same,
the result is 20. If two of the numbers are the same, the result is 10.

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
 */