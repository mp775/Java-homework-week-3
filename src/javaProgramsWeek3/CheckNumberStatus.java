package javaProgramsWeek3;

/* Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO” */

import java.util.Scanner;

// instance method
public class CheckNumberStatus {
    public void checkStatusOfNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scan.nextInt();
        scan.close();

        if(num>0)
        {
            System.out.println(num + " is positive number.");
        }
        else if(num<0)
        {
            System.out.println(num + " is negative number.");
        }
        else
        {
            System.out.println("The number is zero.");
        }
    }

    public static void main(String[] args) {
        CheckNumberStatus obj = new CheckNumberStatus(); // creating object
        obj.checkStatusOfNumber(); // calling instance method using an object
    }
}
