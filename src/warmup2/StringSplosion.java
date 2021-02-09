package warmup2;

public class StringSplosion {
    public static  String stringSplosion(String str) {

        // return data: String
        // param: String

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i+1);  // every iteration add from 0 to i + 1
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(stringSplosion("Hello Everyone"));
    }
}

/*

Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */
