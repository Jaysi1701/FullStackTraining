package day5pp;
import java.util.*;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of flips: ");
        int n = sc.nextInt();

        int heads = 0, tails = 0;

        for (int i = 1; i <= n; i++) {
            if (Math.random() < 0.5)
                heads++;
            else
                tails++;
        }

        System.out.println("Heads % = " + (heads * 100.0 / n));
        System.out.println("Tails % = " + (tails * 100.0 / n));
    }
}