package javaProgramsWeek3;

/* Write a Java program to calculate the average value of array elements */

import java.util.Arrays;

public class AverageOfArray {

    // static method
    public static void findAvgOfAnArrayElements(){
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};

        int sum = 0;
        for(int i=0; i < numbers.length ; i++)  // Calculate sum of all array elements using for loop
            sum = sum + numbers[i];

        double average = sum / numbers.length;  // Calculate average value
        System.out.println("Numeric array : "+ Arrays.toString(numbers));
        System.out.println("Average value of the array elements is : " + average);
    }

    public static void main(String[] args) {
        findAvgOfAnArrayElements();  // calling static method
    }
}
