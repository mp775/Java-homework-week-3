package javaProgramsWeek3;

/* Write a Java program to sort a numeric array and a string array */

import java.util.Arrays;

public class SortArray {

    // instance method
    public void sortNumericArray() {
        int[] numericArray = {
                3367, 1234, 7845, 1478, 2022,
                1999, 2458, 3214, 1472, 2021,
                1456, 2165, 1457, 2025
        };
        System.out.println("Original numeric array : "+Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array : "+Arrays.toString(numericArray));
    }

    // static method
    public static void sortStringArray() {
        String[] stringArray = {
                "Automation",
                "Manual",
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        System.out.println("Original string array : "+Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted string array : "+Arrays.toString(stringArray));
    }

    public static void main(String[] args) {
        SortArray obj = new SortArray();  // creating object
        obj.sortNumericArray();  // calling instance method using an object
        sortStringArray();  // calling static method
    }
}
