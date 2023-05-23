package javaProgramsWeek3;

/* Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%  */


import java.util.Scanner;

public class SalesCommission {
    int saleID, amount, basicSalary;
    String name;
    double commission;

    // instance method
    public void salesInformation() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Seller name: ");
        name = ob.nextLine();
        System.out.println("Sales Id: ");
        saleID = ob.nextInt();
        System.out.println("Sales amount: ");
        amount = ob.nextInt();
        System.out.println("Basic salary: ");
        basicSalary = ob.nextInt();
    }

    // instance method
    public void findCommission() {
        if (amount >= 50000) {
            commission = amount * 0.35;
            System.out.println("Commission = " + commission);
        } else if (amount >= 30000) {
            commission = amount * 0.20;
            System.out.println("Commission = " + commission);
        } else if (amount >= 20000) {
            commission = amount * 0.10;
            System.out.println("Commission = " + commission);
        } else if (amount >= 10000) {
            commission = amount * 0.05;
            System.out.println("Commission = " + commission);
        } else if (amount > 0) {
            commission = amount * 0.02;
            System.out.println("Commission = " + commission);
        } else {
            System.out.println("No commission");
        }
        double totalSalary = commission + basicSalary;
        System.out.println("Salary with commission: " + totalSalary);
    }

    public static void main(String[] args) {
        SalesCommission obj = new SalesCommission();  // creating object
        obj.salesInformation();   // calling instance method using an object
        obj.findCommission();   // calling instance method using an object

    }
}
