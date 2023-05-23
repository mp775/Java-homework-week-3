package javaProgramsWeek3;

/* Write a Java program to test if an array contains a specific value */

import java.util.Scanner;

public class PresenceOfArrayElement {

    public static void findElementPresentInArray() {
        boolean elementPresent = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Numeric value: ");
        int num = scan.nextInt();
        scan.close();

        int[] numericArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        for (int i = 0; i < numericArray.length; i++) {

            if (numericArray[i] == num) {
                elementPresent = true;
                break;
            }
        }


        if (elementPresent == true) {
            System.out.println("Numeric Array contains " + num);
        } else {
            System.out.println("Numeric Array doesn't contains " + num);
        }
    }

    public static void main(String[] args) {
        findElementPresentInArray();
    }
}
