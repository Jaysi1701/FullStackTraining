package day2pp;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        System.out.println("a+b*c = " + (a + b * c));
        System.out.println("c+a/b = " + (c + a / b));
        System.out.println("a%b+c = " + (a % b + c));
        System.out.println("a*b+c = " + (a * b + c));

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}