package javaProgramsWeek3;

import java.util.Scanner;

/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry - using Switch Statement */

public class PrintCityNameSwitchStatement {

    public void printCityName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Alphabet from A to F: ");
        char  alphabet = scan.next().charAt(0);
        scan.close();

        // Switch statement
        switch (alphabet) {
            case 'A':
                System.out.println("Ahmedabad");
                System.out.println("Anand");
                System.out.println("Agra");
                break;
            case 'B':
                System.out.println("Bhavnagar");
                System.out.println("Bhuj");
                System.out.println("Banglore");
                break;
            case 'C':
                System.out.println("Chennai");
                System.out.println("Chandigarh");
                System.out.println("Chittoor");
                break;
            case 'D':
                System.out.println("Div");
                System.out.println("Daman");
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Edmonton");
                System.out.println("Enugu");
                System.out.println("East London");
                break;
            case 'F':
                System.out.println("Fatehnagar");
                System.out.println("Faizpur");
                System.out.println("Ferozepur");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }

    public static void main(String[] args) {
        PrintCityNameSwitchStatement obj = new PrintCityNameSwitchStatement(); // creating object
        obj.printCityName(); // calling instance method
    }
}
