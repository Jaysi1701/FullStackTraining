
// Problem 3 - Commercial Data Processing

package day11pp;

import java.time.LocalDateTime;

public class CompanyShares {
    String symbol;
    int shares;
    LocalDateTime dateTime;

    public CompanyShares(String symbol, int shares) {
        this.symbol = symbol;
        this.shares = shares;
        this.dateTime = LocalDateTime.now();
    }

    public void display() {
        System.out.println(symbol + " | Shares: " + shares + " | " + dateTime);
    }
}