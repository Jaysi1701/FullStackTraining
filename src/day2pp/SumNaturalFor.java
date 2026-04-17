package day2pp;

import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) System.out.print("+");
            sum += i;
        }

        System.out.println("=" + sum);
    }
}