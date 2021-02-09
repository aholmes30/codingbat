package warmup2;

public class Last2 {
    public static int last2(String str) {

        // return data: int
        // param: String

        // find the last two chars of string
        // find out how many times those last two chars repeat
        // last two in string: str.substring(str.length()-2)

        int count = 0;
        if(str.length() > 2) {
            String lastTwoChars = str.substring(str.length()-2);
            for(int i = 0; i < str.length()-2; i++) {
                if(str.substring(i, i + 2).equals(lastTwoChars)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(last2("Doggxxo is xxcutxxexx"));
    }

}

/*

Given a string, return the count of the number of times that a substring length 2
appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1
(we won't count the end substring).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */
