package day2pp;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int temp = n, rev = 0;

        for (; temp != 0; temp /= 10) {
            rev = rev * 10 + temp % 10;
        }

        if (n == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome Number");
    }
}
