package day6;

class Vehicle {
    void run() {
        System.out.println("Vehicle running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike running");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.run();
    }
}