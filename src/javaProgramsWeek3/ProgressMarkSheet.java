package javaProgramsWeek3;

/* Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format */


import java.util.Scanner;

public class ProgressMarkSheet {
    int rno, math, science, english, total;
    double per;
    String name, result;

    public void getData() {
        Scanner mark = new Scanner(System.in);
        System.out.println("Enter student name:");
        name = mark.nextLine();
        System.out.println("Roll no :");
        rno = mark.nextInt();
        System.out.println("Math");
        math = mark.nextInt();
        if(math >100 || math <0){
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.println("Please re-enter correct marks of Maths");
            math = mark.nextInt();
        }
        System.out.println("Science");
        science = mark.nextInt();
        if(science >100 || science <0){
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.println("Please re-enter correct marks of Science");
            science = mark.nextInt();
        }
        System.out.println("English");
        english = mark.nextInt();
        if(english >100 || english <0){
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.println("Please re-enter correct marks of English");
            english = mark.nextInt();
        }
    }

    public void enterData() {
        System.out.println("--------------------------------------------");
        System.out.println("|                                           |");
        System.out.println("|             Mark Sheet                    |");
        System.out.println("|    Name              :         "+name+"    |");
        System.out.println("|    Roll no           :         "+rno+"    |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|    Subject           :         Mark       |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|     Math             :      "+math+"         |");
        System.out.println("|     Science          :      "+science+"        |");
        System.out.println("|     English          :      "+english+"        |");
        System.out.println("|-------------------------------------------    |");

    }

    public void marksCalculation() {
        total = math + science + english;
        System.out.println("|      Total           :      "+total+"             |");
        System.out.println("|-------------------------------------------|");
        per = total / 3;
        System.out.println("|      Percentage      :      "+per+"          |");
        if (per >= 35) {
            result = "Pass";
        }else {
            result = "Fail";
        }
        System.out.println("|      Result      :          "+result+"          |");
    }

    public void grade() {
        if (per >= 80) {
            System.out.println("|       Grade       :       A+             |");
        } else if (per >= 60) {
            System.out.println("|       Grade       :       A              |");
        } else if (per >= 50) {
            System.out.println("|       Grade       :       B              |");
        } else if (per > 40) {
            System.out.println("|       Grade       :       C                |");
        }
        System.out.println("|------------------------------------------|");
    }

    public static void main(String[] args) {
        ProgressMarkSheet obj = new ProgressMarkSheet();
        obj.getData();
        obj.enterData();
        obj.marksCalculation();
        obj.grade();
    }
}
