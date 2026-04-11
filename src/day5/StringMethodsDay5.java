package day5;
import java.io.*;

public class StringMethodsDay5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter string: ");
        String str = br.readLine();

        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Trim: " + str.trim());
        System.out.println("Substring: " + str.substring(1, 4));
        System.out.println("Replace: " + str.replace('a', '@'));
        System.out.println("Contains 'java': " + str.contains("java"));
    }
}