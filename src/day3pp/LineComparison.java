// Line Comparison Problem
package day3pp;

import java.util.Scanner;

class LineComparison {
    double x1, y1, x2, y2;

    LineComparison(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    double length() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Line Comparison Computation Program");

        System.out.println("Enter Line 1 points:");
        LineComparison line1 = new LineComparison(
                sc.nextDouble(), sc.nextDouble(),
                sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter Line 2 points:");
        LineComparison line2 = new LineComparison(
                sc.nextDouble(), sc.nextDouble(),
                sc.nextDouble(), sc.nextDouble());

        double len1 = line1.length();
        double len2 = line2.length();

        System.out.println("Length of Line 1 = " + len1);
        System.out.println("Length of Line 2 = " + len2);

        if (len1 == len2)
            System.out.println("Both lines are equal");
        else if (len1 > len2)
            System.out.println("Line 1 is greater than Line 2");
        else
            System.out.println("Line 1 is smaller than Line 2");
    }
}