package day2pp;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int m = sc.nextInt();

        System.out.print("Enter day: ");
        int d = sc.nextInt();

        boolean result =
                (m == 3 && d >= 20) ||
                        (m == 4) ||
                        (m == 5) ||
                        (m == 6 && d <= 20);

        System.out.println(result);
    }
}