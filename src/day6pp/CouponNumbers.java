package day6pp;
import java.util.*;

public class CouponNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        Random r = new Random();

        int count = 0;

        while(set.size() < n) {
            int num = r.nextInt(n);
            set.add(num);
            count++;
        }

        System.out.println("Random numbers needed: " + count);
    }
}