package day8pp;

public class EmployeeWageUC7 {

    // Class Variables (shared by all methods in this class)
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int NUM_OF_WORKING_DAYS = 20;
    static final int MAX_HRS_IN_MONTH = 100;

    // Class Method to compute employee wage
    public static void computeEmpWage() {

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        // Loop until max hours or max days reached
        while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
                totalWorkingDays < NUM_OF_WORKING_DAYS) {

            totalWorkingDays++;

            int empCheck = (int) (Math.random() * 3);

            switch (empCheck) {

                case IS_FULL_TIME:
                    empHrs = 8;
                    break;

                case IS_PART_TIME:
                    empHrs = 4;
                    break;

                default:
                    empHrs = 0;
            }

            totalEmpHrs = totalEmpHrs + empHrs;

            System.out.println("Day : " + totalWorkingDays +
                    " | Employee Hours : " + empHrs);
        }

        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;

        System.out.println("----------------------------------");
        System.out.println("Total Working Days : " + totalWorkingDays);
        System.out.println("Total Employee Hours : " + totalEmpHrs);
        System.out.println("Total Employee Wage : " + totalEmpWage);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        computeEmpWage();
    }
}