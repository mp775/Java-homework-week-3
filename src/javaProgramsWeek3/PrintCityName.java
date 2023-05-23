package javaProgramsWeek3;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry*/

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class PrintCityName {

    public void inputAlphabetAndPrintCity(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Alphabet from A to F: ");
        char  alphabet = scan.next().charAt(0);
        scan.close();

        if (alphabet == 'A')
        {
            System.out.println("Ahmedabad");
            System.out.println("Anand");
            System.out.println("Agra");
        } else if (alphabet == 'B') {
            System.out.println("Bhavnagar");
            System.out.println("Bhuj");
            System.out.println("Banglore");
        } else if (alphabet == 'C') {
            System.out.println("Chennai");
            System.out.println("Chandigarh");
            System.out.println("Chittoor");
        } else if (alphabet == 'D') {
            System.out.println("Div");
            System.out.println("Daman");
            System.out.println("Delhi");
        } else if (alphabet == 'E') {
            System.out.println("Edmonton");
            System.out.println("Enugu");
            System.out.println("East London");
        } else if (alphabet == 'F') {
            System.out.println("Fatehnagar");
            System.out.println("Faizpur");
            System.out.println("Ferozepur");
        } else {
            System.out.println("Invalid entry");
        }
    }

    public static void main(String[] args) {
        PrintCityName obj = new PrintCityName();
        obj.inputAlphabetAndPrintCity();
    }
}
