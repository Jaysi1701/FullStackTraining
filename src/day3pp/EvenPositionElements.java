// 5) Elements at even position
package day3pp;

import java.util.Scanner;

public class EvenPositionElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even position elements:");

        for (int i = 1; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}