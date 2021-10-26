import java.util.Scanner;
//Question 5) Wap to input any two numbers and their print their interchanged value
public class InterchangedValue {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value of X and Y -");
    int x = scan.nextInt();
    int y = scan.nextInt();
    int swap;
    System.out.println("The values of X and Y before swapping are - " +x+ " " +y);
    //Now swapping the numbers
    swap=x;
    x=y;
    y=swap;
    System.out.println("The values of X and Y after swapping are - " +x+ " " +y);
    }
}