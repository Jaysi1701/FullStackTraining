package day2;
public class ControlFlowDemo {
    static void main(String[] args) {
        int num = 5;

        // IF-ELSE
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // SWITCH
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day");
        }

        // FOR LOOP
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // skip 3
            System.out.println(i);
        }

        // WHILE LOOP
        int i = 1;
        System.out.println("While loop:");
        while (i <= 5) {
            if (i == 4) break; // stop at 4
            System.out.println(i);
            i++;
        }

        // DO-WHILE
        int j = 1;
        System.out.println("Do-while loop:");
        do {
            System.out.println(j);
            j++;
        } while (j <1



        );
    }
}
