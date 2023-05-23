package javaProgramsWeek3;

/* Write a Java program to sum values of an array */

import java.util.Arrays;

public class SumOfArray {

    // instance method
    public void findSumOfArray(){
        int numericArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : numericArray)
            sum += i;
        System.out.println("Numeric array : "+ Arrays.toString(numericArray));
        System.out.println("The sum of numeric array is: " + sum);
    }

    public static void main(String[] args) {
        SumOfArray obj = new SumOfArray();  // creating object
        obj.findSumOfArray();  // calling instance method using an object
    }
}
