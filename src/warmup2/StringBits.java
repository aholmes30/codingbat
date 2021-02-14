package warmup2;

public class StringBits {

    public static String stringBits(String str) {

        // return data: String
        // param: String

        String result = "";

        for(int i = 0; i < str.length(); i = i + 2) { // we need to increment by two, not 1
            result = result + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringBits("That dog is so cute"));
    }

}

/*

Given a string, return a new string made of every other char starting with the first,
so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */
