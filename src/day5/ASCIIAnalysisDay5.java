package day5;
import java.io.*;

public class ASCIIAnalysisDay5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter string: ");
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch + " -> " + (int) ch);
        }
    }
}