package warmup1;

public class MonkeyTrouble {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        //return data: boolean
        //param: boolean

        if(aSmile && bSmile) {
            return true;
        }

        if(!aSmile && !bSmile) {
            return true;
        }

        return false;

    }

}

/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling.
Return true if we are in trouble.

Examples:
monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
 */
