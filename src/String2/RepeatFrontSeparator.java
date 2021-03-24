package String2;

public class RepeatFrontSeparator {
    public static String repeatSeparator(String word, String sep, int count) {
        //method name: repeatSeparator
        //method type: 4 -> return data is String, params are word, sep, and int count

        //word and sep are strings
        //count is int

        //use a loop

        String answer = word;               //initialize word
        if(count < 1){
            return ""; //just return an empty string
        }
        for(int i = 0; i < count-1; i++) {
            answer = answer + sep;
            answer = answer + word;
        }

        return answer;

    }

}

/*
Given two strings, word and a separator sep, return a big string made of count
occurrences of the word, separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
 */
