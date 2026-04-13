package day6;

interface AnimalI {
    void sound();
}

class Cat implements AnimalI {
    public void sound() {
        System.out.println("Meow");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        AnimalI a = new Cat();
        a.sound();
    }
}