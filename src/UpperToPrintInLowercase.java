import java.util.Scanner;
//Question 12) Input any alphabet in Uppercase and print in Lowercase.
public class UpperToPrintInLowercase {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an alphabet in Uppercase- ");
    char lower = scan.nextLine().charAt(0);
    System.out.print("Result will be printed in Lowercase - " + Character.toLowerCase(lower));
    }
}
