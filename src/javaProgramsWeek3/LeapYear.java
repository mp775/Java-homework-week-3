package javaProgramsWeek3;

import java.util.Scanner;

/* Write a java program to input any year like (ex.2007) and find out if it is leap year or not? */

public class LeapYear {

    // static method
    public static void findLeapYear() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int inputYear = scan.nextInt();
        scan.close();

        if(inputYear % 4 == 0 && (inputYear % 100 !=0 || inputYear % 400 == 0)) {
            System.out.println(inputYear + " is a leap year.");
        }
        else {
            System.out.println(inputYear + " is not a leap year.");
        }
    }

    public static void main(String[] args) {
        findLeapYear(); // calling static method
    }
}

