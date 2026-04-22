package day1pp;

public class LeapYear {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter year");
            return;
        }

        int year = Integer.parseInt(args[0]);

        if (year < 1582) {
            System.out.println("Enter year >= 1582");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}