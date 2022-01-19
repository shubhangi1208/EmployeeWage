package com.bridgelabz;
import java.util.Random;
public class employeewagebuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;


    public static void empWage(String company, int wagePerHr,int numWorkingDays,int maxHrPerMonth) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while( totalEmpHrs <= maxHrPerMonth && totalWorkingDays < numWorkingDays) {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Present as PART TIME");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present as FULL TIME");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day No :"+ totalWorkingDays +" Emp Hrs: "+ empHrs);
        }
        int totalEmpWage = totalEmpHrs * wagePerHr;
        System.out.println("Total Employee Wage for Company : "+ company +" is : "+totalEmpWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages Program.");
        empWage("Atos Syntel",30,20,100);
       empWage("TCS",40,20,100);
    }
}







