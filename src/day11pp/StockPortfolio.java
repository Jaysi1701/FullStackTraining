
package day11pp;

import java.util.Scanner;

public class StockPortfolio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();
        sc.nextLine();

        Stock[] stocks = new Stock[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Stock " + (i + 1));

            System.out.print("Stock Name: ");
            String name = sc.nextLine();

            System.out.print("Number of Shares: ");
            int shares = sc.nextInt();

            System.out.print("Share Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            stocks[i] = new Stock(name, shares, price);
        }

        System.out.println("\n--- Stock Report ---");
        for (Stock s : stocks) {
            s.display();
            total += s.getValue();
        }

        System.out.println("Total Value of All Stocks = " + total);
    }
}