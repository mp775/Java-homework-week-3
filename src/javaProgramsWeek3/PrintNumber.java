package javaProgramsWeek3;
/*11. Write a java program to print the numbers between 1to100 which can be divided by 3 and 5 separately.*/

public class PrintNumber {

    // instance method
    public void printSpecificNumber() {
        System.out.println("Numbers between 1 to 100 which can be divided by 3:");
        for (int i=1; i<100; i++) {
            if (i%3==0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nNumber between 1 to 100 which can be divided by 5: ");
        for (int i=1; i<100; i++) {
            if (i%5==0) System.out.print(i +", ");
        }
    }

    public static void main(String[] args) {
        PrintNumber obj = new PrintNumber();  // creating object
        obj.printSpecificNumber();  // calling instance method
    }
         }


