package javaProgramsWeek3;

import java.util.Scanner;

/*Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)*/
public class OddEvenTernaryOperator {

    // Instance method
    public void findOddEvenNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber = scan.nextInt();
        scan.close();

        //Ternary operator to check number
        String result = inputNumber%2==0 ? "Even number" : "Odd number";
        System.out.println(inputNumber +" is "+ result);

    }

    public static void main(String[] args) {
        OddEvenTernaryOperator obj = new OddEvenTernaryOperator();  // creating object
        obj.findOddEvenNumber(); // calling instance method
    }
}
