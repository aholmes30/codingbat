package warmup1;

public class SleepIn {

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        //return data: boolean
        //param: boolean

        //if it is weekday and it is vacation, param is true
        if(!weekday || vacation) {  //if its not weekday or vacation
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(sleepIn(true, true));
    }

}

/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true
if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

Examples:
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */
