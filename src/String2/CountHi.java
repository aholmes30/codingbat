package String2;

public class CountHi {

    public static int countHi(String str) {

        // return data: int
        // param: String

        int hiCount = 0;

        for(int i = 0; i < str.length()-1; i++) {
            if(str.substring(i, i +2).equals("hi"))
                hiCount++;
        }
        return hiCount++;
    }

    public static void main(String[] args) {
        String str = "Hello, Hi, hi hi hi hi";
        System.out.println(str);
    }

}

/*

Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */
