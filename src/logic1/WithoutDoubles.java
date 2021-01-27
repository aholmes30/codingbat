package logic1;

public class WithoutDoubles {

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {

        // return data: int
        // param: int, int, boolean

        // if no doubles --> if(die1 == die2 && noDoubles) --> add 1 to die1 or die2

        if(die1 == die2 && noDoubles) {
            if(die1 != 6)                   //if die1 does not = 6 just add 1
                return die1 + 1 + die2;
            else
                return 1 + die2;  // add 1 to die2
        }
        else return die1 + die2;
    }



}

/*

Return the sum of two 6-sided dice rolls, each in the range 1..6. However,
if noDoubles is true, if the two dice show the same value, increment one die
to the next value, wrapping around to 1 if its value was 6.

withoutDoubles(2, 3, true) → 5
withoutDoubles(3, 3, true) → 7
withoutDoubles(3, 3, false) → 6
 */