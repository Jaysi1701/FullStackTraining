package day6pp;
import java.util.*;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int notes[] = {1000,500,100,50,10,5,2,1};

        for(int note : notes) {
            if(amount >= note) {
                int count = amount / note;
                amount %= note;
                System.out.println(note + " x " + count);
            }
        }
    }
}