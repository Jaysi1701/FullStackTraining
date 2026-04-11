package day5;
import java.io.*;

public class StringBasicsDay5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String input = br.readLine();

        String literal = "Hello";
        String object = new String("World");

        System.out.println("Line1\nLine2");
        System.out.println("Tab\tSpace");

        System.out.println("User Input: " + input);
        System.out.println(literal + " " + object);
    }
}