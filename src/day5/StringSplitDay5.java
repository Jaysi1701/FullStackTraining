package day5;
import java.io.*;

public class StringSplitDay5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter sentence: ");
        String str = br.readLine();

        String words[] = str.split(" ");

        System.out.println("Word count: " + words.length);

        for (String w : words) {
            System.out.println(w);
        }
    }
}