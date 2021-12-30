package com.bridgelabz;
import java.util.Random;
public class Main {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS=20;
    public static final int TOTAL_WORKING_HOURS=100;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage Builder");
        int empHours = 0;
        int empWage = 0;
        int totalEmployeeWage=0;
        int totalWorkingDays=0;
        int totalEmphours=0;

        while (totalEmphours<=TOTAL_WORKING_HOURS && totalWorkingDays< NO_OF_WORKING_DAYS)
        {
            totalWorkingDays++;
            Random random = new Random();
            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            empWage = empHours * EMP_RATE_PER_HOUR;
            totalEmployeeWage=empWage+totalEmployeeWage;
            totalEmphours+=empHours;
        }
        System.out.println("The total wage of Employee for 20 days or 100 hours is:  " +totalEmployeeWage);
    }
}







