package com.bridgelabz;
import java.util.Random;
public class Main {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage Builder");
        int empHours = 0;
        int empWage = 0;
        Random random = new Random();
        int empCheck = random.nextInt(3);

        switch (empCheck) {
            case IS_FULL_TIME:
                empHours = 8;
                System.out.println("Employee Full Time Present");
                break;
            case IS_PART_TIME:
                empHours = 4;
                System.out.println("Employee Part Time Present");
                break;
            default:
                empHours = 0;
                System.out.println("Employee is Absent ");
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("The daily wage of employee is:  " + empWage);
    }
}







