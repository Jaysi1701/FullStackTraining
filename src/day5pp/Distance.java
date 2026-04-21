package day5pp;
import java.util.*;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        double d = Math.sqrt(x*x + y*y);
        System.out.println(d);
    }
}