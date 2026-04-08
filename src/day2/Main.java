
package day2;
public class Main {
    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();
        obj.display();

        SubClass sub = new SubClass();
        sub.show();

        System.out.println("Public outside class: " + obj.publicVar);
    }
}