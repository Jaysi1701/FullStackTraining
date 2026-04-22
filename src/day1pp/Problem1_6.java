package day1pp;

public class Problem1_6 {
    static int num;

    static {
        num = 100;
        System.out.println("Static block executed");
    }

    static void display() {
        System.out.println("Static method called");
        System.out.println("Static variable = " + num);
    }

    public static void main(String[] args) {
        display();
    }
}