package day5;
import java.io.*;

public class StringParameterDay5 {

    static void analyze(String str) {
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + new StringBuilder(str).reverse());
        System.out.println("Starts with A: " + str.startsWith("A"));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter string: ");
        String input = br.readLine();

        analyze(input);
    }
}