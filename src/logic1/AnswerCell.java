package logic1;

public class AnswerCell {

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        // return data: boolean
        // param: boolean

        if(isAsleep) {
            return false;
        }
        if(isMom && isMorning || !isMorning) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(answerCell(false,  true, false));
    }



}

/*
Your cell phone rings. Return true if you should answer it. Normally you answer,
except in the morning you only answer if it is your mom calling. In all cases,
if you are asleep, you do not answer.

answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false
 */
