package day5pp;
import java.util.*;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b*b - 4*a*c;

        double r1 = (-b + Math.sqrt(delta)) / (2*a);
        double r2 = (-b - Math.sqrt(delta)) / (2*a);

        System.out.println("Root1 = " + r1);
        System.out.println("Root2 = " + r2);
    }
}