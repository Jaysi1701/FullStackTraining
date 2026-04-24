
package day11pp;

public class AccountTest {
    public static void main(String[] args) {

        Account acc1 = new Account(5000);

        System.out.println("Initial Balance: " + acc1.getBalance());

        acc1.debit(2000);
        System.out.println("After Debit 2000: " + acc1.getBalance());

        acc1.debit(4000);
        System.out.println("After Debit 4000: " + acc1.getBalance());
    }
}