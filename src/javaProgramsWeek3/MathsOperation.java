package javaProgramsWeek3;
/*10.Write a java program to input any two number and ask user to enter their symbol (+, -,/, *)
find addition, Subtraction, multiplication and division according to their symbol*/

import java.util.Scanner;

public class MathsOperation {
    public static void calculator() {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter First Number");
        int num1 = s.nextInt();
        System.out.println("Enter Second Number");
        int num2 = s.nextInt();
        System.out.println("Enter Symbol");
        char symbol = s.next().charAt(0);
        s.close();

        if (symbol == '+') {
            int sum = num1 + num2;
            System.out.println("The addition of two number is: " + sum);
        } else if (symbol == '-') {
            int sub = num1 - num2;
            System.out.println("The subtraction of two number is: " + sub);
        } else if (symbol == '*') {
            int mul = num1 * num2;
            System.out.println("The multiplication of two number is: " + mul);
        } else if (symbol == '/') {
            int div = num1/num2;
            System.out.println("The division of two number is: " + div);
        } else {
            System.out.println("Invalid entry");
        }
    }

    public static void main(String[] args) {
        calculator(); // calling static method
    }
}
