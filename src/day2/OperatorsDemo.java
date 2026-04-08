package day2;
public class OperatorsDemo {
    public static void main(String[] args) {

        int a = 10, b = 3;

        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Assignment
        int x = 5;
        x += 3; // x = x + 3
        System.out.println("Assignment (+=): " + x);

        // Increment / Decrement
        int i = 5;
        System.out.println("Post-increment: " + (i++)); // 5
        System.out.println("After increment: " + i);    // 6

        // Logical
        boolean p = true, q = false;
        System.out.println("AND: " + (p && q));
        System.out.println("OR: " + (p || q));
        System.out.println("NOT: " + (!p));

        // Relational
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Bitwise
        int m = 5, n = 3;
        System.out.println("Bitwise AND: " + (m & n));
        System.out.println("Bitwise OR: " + (m | n));
        System.out.println("Bitwise XOR: " + (m ^ n));

        // Ternary
        int max = (a > b) ? a : b;
        System.out.println("Max using ternary: " + max);
    }

}
