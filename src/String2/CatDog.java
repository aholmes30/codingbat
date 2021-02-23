package String2;

public class CatDog {
    public static boolean catDog(String str) {

        //return data: boolean
        //param: string

        int catCount = 0;
        int dogCount = 0;

        for(int i = 0; i < str.length()-2; i++) {
            if(str.substring(i, i + 3).equals("cat"))
                catCount++;
            if(str.substring(i, i + 3).equals("dog"))
                dogCount++;
        }
        if(catCount == dogCount){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(catDog("catdog was a great show"));
    }
}

/*

Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */
