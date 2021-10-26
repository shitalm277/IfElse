import java.util.Scanner;
//Question 7) Wap input any five numbers and then find the average of the five numbers
public class Average {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the 1st number - ");
    int number1 = scan.nextInt();
    System.out.println("Enter the 2nd number - ");
    int number2 = scan.nextInt();
    System.out.println("Enter the 3rd number - ");
    int number3 = scan.nextInt();
    System.out.println("Enter the 4th number - ");
    int number4 = scan.nextInt();
    System.out.println("Enter the 5th number - ");
    int number5 = scan.nextInt();
    //Average calculation= Sum of numbers/ number of numbers
    System.out.println("The Average of five number is - " + (number1 + number2 + number3 + number4 + number5) /5);
    }
}
