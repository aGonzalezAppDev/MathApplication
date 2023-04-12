package com.learntocode;

public class MathApp {

    public static void main(String[] args) {
        double jobSalary  = 5432.32;
        double job2Salary = 9867.00;
        double largestNum = Math.max(jobSalary,job2Salary);

        System.out.println("The largest number is " + largestNum);

        double carPrice   = 2341.34;
        double truckPrice = 9837.90;
        double smallerNum = Math.min(carPrice, truckPrice);
        System.out.println("The smallest number is " + smallerNum);

        double radius = 5.0;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);

        double num1 = 5.0;
        double sqrtNum1 = Math.sqrt(num1);
        System.out.println("The square root of "+ num1 + " is " + sqrtNum1);


    }
}
