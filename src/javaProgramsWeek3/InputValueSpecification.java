package javaProgramsWeek3;

/* Write a program that tells us input value is number or an alphabet or symbol */

import java.util.Scanner;

public class InputValueSpecification {

    // instance method
    public void checkInputValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number or char or symbol: ");
        char ch = scanner.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is a ALPHABET.");

        } else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + " is a NUMBER.");

        } else {

            System.out.println(ch + " is a SPECIAL CHARACTER.");
        }
    }

    public static void main(String[] args) {
        InputValueSpecification obj = new InputValueSpecification();  // creating object
        obj.checkInputValue();  // calling instance method using an object
    }
}
