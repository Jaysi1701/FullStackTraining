package day4;

public class LibraryDemo {

    // 5. Static method
    public static void display() {
        System.out.println("Static method called");
    }

    public static void main(String[] args) {

        // Static method call
        display();

        // 6. Standard library methods
        String text = "hello";
        System.out.println("Uppercase: " + text.toUpperCase());

        // 7. Math class
        System.out.println("Square root: " + Math.sqrt(16));
        System.out.println("Power: " + Math.pow(2, 3));
        System.out.println("Max: " + Math.max(10, 20));
    }
}