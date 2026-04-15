package day2PP;
import java.util.Scanner;

public class ReverseFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rev = 0;

        for (int temp = n; temp != 0; temp = temp / 10) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
        }

        System.out.println("Reverse = " + rev);
    }
}