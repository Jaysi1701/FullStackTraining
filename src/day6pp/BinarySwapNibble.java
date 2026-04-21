package day6pp;
import java.util.*;

public class BinarySwapNibble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int result = ((x & 0x0F) << 4 | (x & 0xF0) >> 4);

        System.out.println("After Swap = " + result);

        if((result & (result - 1)) == 0)
            System.out.println("Power of 2");
        else
            System.out.println("Not Power of 2");
    }
}