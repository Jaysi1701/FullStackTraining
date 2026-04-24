
package day11pp;

import java.util.ArrayList;

public class StockAccount {

    ArrayList<CompanyShares> list = new ArrayList<>();

    public void buy(String symbol, int shares) {
        for (CompanyShares c : list) {
            if (c.symbol.equalsIgnoreCase(symbol)) {
                c.shares += shares;
                c.dateTime = java.time.LocalDateTime.now();
                return;
            }
        }

        list.add(new CompanyShares(symbol, shares));
    }

    public void sell(String symbol, int shares) {
        for (CompanyShares c : list) {
            if (c.symbol.equalsIgnoreCase(symbol)) {
                if (c.shares >= shares) {
                    c.shares -= shares;
                    c.dateTime = java.time.LocalDateTime.now();
                } else {
                    System.out.println("Not enough shares.");
                }
                return;
            }
        }
        System.out.println("Stock not found.");
    }

    public void printReport() {
        System.out.println("\n--- Stock Account Report ---");
        for (CompanyShares c : list) {
            c.display();
        }
    }

    public static void main(String[] args) {
        StockAccount sa = new StockAccount();

        sa.buy("TCS", 10);
        sa.buy("INFY", 5);
        sa.buy("TCS", 5);

        sa.sell("INFY", 2);

        sa.printReport();
    }
}