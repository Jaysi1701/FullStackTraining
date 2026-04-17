package Day5PP;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
        }
    }
}