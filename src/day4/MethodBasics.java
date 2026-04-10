package day4;

public class MethodBasics {

    // 1. User-defined method
    public static void greet() {
        System.out.println("Hello!");
    }

    // 2. Reusable method
    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    // 3. Dynamic method (parameters)
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Calling methods multiple times
        greet();
        greet();

        printMessage("Welcome to Java Methods");

        int result = add(10, 20);
        System.out.println("Sum: " + result);
    }
}