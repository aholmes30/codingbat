package String2;

public class EndOther {

    public static boolean endOther(String a, String b) {

        // return data: boolean
        // param: String

        a = a.toLowerCase();
        b = b.toLowerCase();

        String large = a;
        String small = b;

        if(a.length() < b.length()) {
            large = b;
            small = a;
        }

        String check = large.substring(large.length() - small.length(), large.length());

        return check.equals(small);

    }

    public static void main(String[] args) {
        System.out.println(endOther("Hi there friend", "hello therefriend"));
    }
}

/*

Given two strings, return true if either of the strings appears at the very
end of the other string, ignoring upper/lower case differences (in other words,
the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */
