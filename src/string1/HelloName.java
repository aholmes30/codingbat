package string1;

public class HelloName {

    public static String helloName(String name) {

        //return data: String
        //param: String

        return "Hello" + " " + name + "!";

    }

    public static void main(String[] args) {
        System.out.println(helloName("Fawad"));
    }
}

/*

Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 */
