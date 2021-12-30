package com.bridgelabz;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage Builder");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int empHours = 0;
        int empWage = 0;
        Random random = new Random();
        int empCheck = random.nextInt(3);

        if (empCheck == IS_FULL_TIME) {
            empHours = 8;
            System.out.println("Employee is present");
        } else if (empCheck == IS_PART_TIME) {
            empHours = 4;
            System.out.println("Part time Employee");
        } else {
            empHours = 0;
            System.out.println("Employee is Absent");

        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("The daily wage of an employee is " + empWage);
    }
}


