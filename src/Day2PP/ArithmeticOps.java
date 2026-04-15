package day2PP;
import java.util.Scanner;

public class ArithmeticOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("a + b*c = " + (a + b * c)); //i
        System.out.println("c + a/b = " + (c + a / b));//ii
        System.out.println("a % b + c = " + (a % b + c)); //iii
        System.out.println("a * b + c = " + (a * b + c)); //iv
    }
}