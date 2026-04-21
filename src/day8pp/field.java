package day8pp;


interface payment{
    void payPayment(String name);
}

class UPI implements payment{

    @Override
    public void payPayment(String name) {
        System.out.println("payment : "+name);
    }
}

class Card implements payment {
    @Override
    public void payPayment(String name) {
        System.out.println("payment : "+name);
    }
}

class Cash implements payment{
    @Override
    public void payPayment(String name) {
        System.out.println("payment : "+name);
    }
}
public class field {
    private String name;
    private int age;
    private String dept;

    field(){

    }

    field(String name, int age, String dept){
        this.name = name;
        this.age = age;
        this.dept = dept;
    }



    public static void main(String[] arguments) {
        UPI payment = new UPI();
        Cash payment1 = new Cash();
        Card payment2 = new Card();
        payment.payPayment("UPI");
        payment1.payPayment("Cash");
        payment2.payPayment("Card");
        field ff = new field("Surya", 24,"MCA");

    }
}
