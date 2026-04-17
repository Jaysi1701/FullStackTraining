package Day4PP;

import java.util.Random;

public class EmployeeWageBuilder {

    // Constants
    static final int IS_ABSENT = 0;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;

    static final int EMP_RATE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;

    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalSalary = 0;

        Random random = new Random();

        // UC6 → Loop till condition met
        while (totalEmpHrs <= MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) {

            totalWorkingDays++;

            int empCheck = random.nextInt(3); // UC1
            int empHrs = 0;

            // UC4 → Switch Case
            switch (empCheck) {

                case IS_FULL_TIME:
                    empHrs = FULL_DAY_HOURS;
                    break;

                case IS_PART_TIME:
                    empHrs = PART_TIME_HOURS;
                    break;

                default:
                    empHrs = 0;
            }

            // UC2 → Daily Wage
            int dailyWage = empHrs * EMP_RATE_PER_HOUR;

            totalEmpHrs += empHrs;
            totalSalary += dailyWage;

            System.out.println("Day " + totalWorkingDays +
                    " | Work Hours: " + empHrs +
                    " | Daily Wage: " + dailyWage);
        }

        // UC5 → Monthly Wage
        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalEmpHrs);
        System.out.println("Total Monthly Salary: " + totalSalary);
    }
}