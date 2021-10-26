import java.util.Locale;
import java.util.Scanner;
//Question 12) Input any alphabet in Uppercase and print in Lowercase.
public class UpperToPrintInLowercase {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the word or sentence in Uppercase- ");
    String lower = scan.nextLine();
    System.out.print("Result will be printed in Lowercase - " + lower.toLowerCase(Locale.ROOT));
    }
}
