package warmup1;

public class StringE {

    public static boolean stringE(String str) {

        // return data: boolean
        // param: String

        int eCount = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e')
                eCount++;
        }
        return eCount >= 1 && eCount <=3;
    }

    public static void main(String[] args) {

        System.out.println(stringE("Hello there everyone"));
    }

}

/*

Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
