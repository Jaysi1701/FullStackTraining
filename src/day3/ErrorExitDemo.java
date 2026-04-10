package day3;

public class
ErrorExitDemo {
    public static void main(String[] args) {

        int age = -5;

        if (age < 0) {
            System.err.println("Error: Age cannot be negative!");
            System.exit(0); // terminates program
        }

        System.out.println("Valid age: " + age);
    }
}
