package warmup1;

public class Diff21 {

    public int diff21(int n) {

        //return data: int
        //param: int

        int difference = Math.abs(n - 21);

        if(n > 21) {
            return difference * 2;
        }
        return difference;
    }

}

/*

Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */