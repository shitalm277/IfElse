import java.util.Scanner;
//Question 1) Input any two number and find out its Odd or Even use turnery operator(?:)
public class TurneryOperator {
    public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the number-");
     int a = scan.nextInt();
     String result = a%2==0 ? " Even " : " Odd ";
     System.out.println(a + " is " + result + "number");
    }
}
