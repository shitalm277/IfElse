import java.util.Scanner;
//Question 3) WAP to input student name, roll no, 3 subjects marks..and find out total, percentage and result if
//he is pass or fail on basis of percentage (pass>=35) and also give them grade
//>= 80 A+
//>= 60 A
//>= 50 B
//>= 35 C
public class TotalPercentageGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Student Name - ");
        String name = scan.nextLine();

        System.out.print("Roll number - ");
        int roll = scan.nextInt();

        System.out.print("1st subject marks - ");
        int marks1 = scan.nextInt();

        System.out.print("2nd subject marks - ");
        int marks2 = scan.nextInt();

        System.out.print("3rd subject marks - ");
        int marks3 = scan.nextInt();

        int total = marks1 + marks2 + marks3;
        float percentage = (float) (total / 300.0 * 100.0);
        String grade = " ";
        String result;

        if (percentage >= 80) {
            grade = "A+";
            result = "PASS";
        } else if (percentage >= 60) {
            grade = "A";
            result = "Pass";
        } else if (percentage >= 50) {
            grade = "B";
            result = "PASS";
        } else if (percentage >= 35) {
            grade = "C";
            result = "PASS";
        } else {
            result = "FAIL";
        }
        if (result == "PASS")
        {
            System.out.println("Total Marks = " + total);
            System.out.println("Percentage = " + percentage);
            System.out.println("Grade = " + grade);
            System.out.println("Result = " + result);
        }
        else
        {
            System.out.println("Total MArks = " +total);
            System.out.println("Percentage = " +percentage);
            System.out.println("Result = " +result);
        }
    }
}