package day5;
import java.io.*;

public class StringArrayDay5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String arr[] = new String[3];

        System.out.println("Enter 3 strings:");
        for (int i = 0; i < 3; i++) {
            arr[i] = br.readLine();
        }

        for (String s : arr) {
            System.out.println(s.toUpperCase() + " - Length: " + s.length());
        }
    }
}
