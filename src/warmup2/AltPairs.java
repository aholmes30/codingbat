package warmup2;

public class AltPairs {

    public static String altPairs(String str) {

        // return data: String
        // param: String

        // going to be returning a new string and removing every next pair of indexes

        String result = "";

        for(int i = 0; i < str.length(); i+=4) {
            result = result + str.charAt(i);
            if(i + 1 < str.length()) {
                result = result + str.charAt(i+1);
            }
        }
        return result;
    }


}

/*

Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */
