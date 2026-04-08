package day2;
public class SubClass extends AccessDemo {

    public void show() {
        // System.out.println(privateVar); ❌ NOT accessible
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}