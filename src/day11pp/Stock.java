
// Problem 1 - Stock Account Management

package day11pp;

public class Stock {
    String name;
    int numberOfShares;
    double sharePrice;

    public Stock(String name, int numberOfShares, double sharePrice) {
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public double getValue() {
        return numberOfShares * sharePrice;
    }

    public void display() {
        System.out.println("Stock Name: " + name);
        System.out.println("Shares: " + numberOfShares);
        System.out.println("Price Per Share: " + sharePrice);
        System.out.println("Total Value: " + getValue());
        System.out.println("----------------------");
    }
}