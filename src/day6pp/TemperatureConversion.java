package day6pp;
import java.util.*;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.C to F  2.F to C");
        int choice = sc.nextInt();
        double temp = sc.nextDouble();

        if(choice == 1)
            System.out.println((temp * 9/5) + 32);
        else
            System.out.println((temp - 32) * 5/9);
    }
}