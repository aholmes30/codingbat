package String2;

public class PrefixAgain {

    public static boolean prefixAgain(String str, int n) {
        //method name: prefixAgain
        //method type: 4 -> return data is boolean, params are str and int n

        String prefix = str.substring(0, n);

        //n-1 = last index of prefix

        for(int i = n; i < str.length(); i++){
            if(n + i <= str.length()) {
                if(prefix.equals(str.substring(i, n+i))) {
                    //checking if first group of N chars is going to happen again within this string
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(prefixAgain("catDog", 3));
    }

}

/*
Given a string, consider the prefix string made of the first N chars of the string.
Does that prefix string appear somewhere else in the string? Assume that the string
is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
 */
