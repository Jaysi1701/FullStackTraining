package day2PP;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n, rev = 0;

        for (int temp=n; temp != 0; temp /= 10) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
        }

        if (original == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}