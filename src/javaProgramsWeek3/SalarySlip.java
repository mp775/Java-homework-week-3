package javaProgramsWeek3;

import java.util.Scanner;

/* WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|    */


public class SalarySlip {

    int empId, salary;
    double HRA, DA, TA, PF, GS;
    String name;

    // instance method
    public void getData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        name = scan.nextLine();
        System.out.println("Enter Employee ID: ");
        empId = scan.nextInt();
        System.out.println("Enter Employee Salary =");
        salary = scan.nextInt();
        HRA = salary * 0.10;
        DA = salary * 0.08;
        TA = salary * 0.09;
        PF = salary * 0.20;
        GS = salary + HRA + TA + DA - PF;
    }

    // instance method
    public void paySlip() {
        System.out.println("________________________________________");
        System.out.println("|        Salary Slip                   |");
        System.out.println("|______________________________________|");
        System.out.println("|Employee Id     :  " + empId + "      |");
        System.out.println("|Employee Name   :  " + name + "       |");
        System.out.println("|_____________________________________ |");
        System.out.println("|Basic Salary    :  " + salary + "     |");
        System.out.println("|HRA 10%         :  " + HRA + "        |");
        System.out.println("|TA 8%           :  " + TA + "         |");
        System.out.println("|DA 9%           :   " + DA + "        |");
        System.out.println("|PF- 20&         :   " + PF + "        |");
        System.out.println("|______________________________________|");
        System.out.println("|Gross salary     :   "+GS+"           |");
        System.out.println("|======================================|");
    }

    public static void main(String[] args) {
        SalarySlip obj = new SalarySlip(); // creating object
        obj.getData(); // calling instance method using an object
        obj.paySlip(); // calling instance method using an object
    }
}
