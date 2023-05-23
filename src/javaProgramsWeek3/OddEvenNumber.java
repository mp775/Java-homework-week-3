package javaProgramsWeek3;
/*Write a java program to input any number and find out if it’s odd or even */

import java.util.Scanner;

public class OddEvenNumber {

    // instance method
    public void oddorEvenNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        s.close();
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }

    public static void main(String[] args) {
        OddEvenNumber obj = new OddEvenNumber();  // creating object
        obj.oddorEvenNumber();  // calling instance method
    }
}