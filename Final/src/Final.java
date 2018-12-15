// Name: EmpPay.java
// Author: Congjia Lu (137832168)
// Date: 2018/10/12
// Description: This file asks the user to input level of experience, hours they worked, and insurance they paid, in order to calculate their net
//				pay and gross pay. The requirement didn't indicate if this is a daily pay, bi-weekly pay, or monthly pay, so this program only designed
//				that the work hour cannot be negative, instead of setting a maximum hour. However, the experience level can only be from 1 to 5.

import java.util.Scanner;
aaa
public class Final {

    private static int [] level = {1, 2, 3, 4, 5};
    private static double grossPay, netPay, insurance;
    private static double [] hourlyRate = {14.0, 17.0, 20.0, 25.0, 30.0};
    private static double [] overtimeRate = {17.0, 20.0, 25.0, 30.0, 35.0};
    private static int workHours, overHours;

    public static void main(String[] args) {
        //input level of experience
        Scanner input = new Scanner (System.in);
        int userLevel;
        while (true) {
            System.out.println("Please enter your level of experience (1, 2, 3, 4 ,5) > ");

            userLevel = input.nextInt();
            if (userLevel > 5 || userLevel < 1) {
                System.out.println("The level you entered is invalid. Please try again.\n");
            }
            else {
                break;
            }
        }

        //input regular work hours
        while (true) {
            System.out.println("Please enter your regular work hours> ");
            workHours = input.nextInt();
            if (workHours < 0) {
                System.out.println("The regular work hours you entered is invalid. Please try again.\n");
            }
            else {
                break;
            }
        }

        //input overtime work hours
        while (true) {
            System.out.println("Please enter your overtime work hours> ");
            overHours = input.nextInt();
            if (overHours < 0) {
                System.out.println("The overtime work hours you entered is invalid. Please try again.\n");
            }
            else {
                break;
            }
        }

        //input insurance paid
        while (true) {
            System.out.println("Please enter your insurance, enter 0 if you don't have insurance> ");
            insurance = input.nextDouble();
            if (insurance < 0.0) {
                System.out.println("The insurance number you entered is invalid. Please try again.\n");
            }
            else {
                break;
            }
        }

        //calculate level, grossPay, and netPay
        int index = 0;
        for(;index<5;index++) {
            if(level[index] == userLevel)
                break;
        }
        input.close();
        grossPay = workHours * hourlyRate[index] + overHours * overtimeRate[index];
        netPay = grossPay * 0.75 - insurance;
        int totalHour = workHours + overHours;

        //Output user level, total hours, regular hours, overtime hours, gross pay, insurance, and net pay
        System.out.println("Your level is " + userLevel + ". You worked " + totalHour + " hours in total, including " + workHours + " regular hours and " + overHours + " overtime hours. your Gross pay is: " + grossPay + ". After tax and your insurance " + insurance + ", your net pay is " + netPay);
    }

}
