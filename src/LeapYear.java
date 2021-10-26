import java.util.Scanner;
//Question 2) Wap to input any year like 1989 and find out if it is a leap year
public class LeapYear {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println(" Enter a Year- ");
    int year = scan.nextInt();
    if
     //This is the Leap year condition
     ((year % 4 == 0) &&(year % 100 != 0) || (year % 400 == 0)) {
     System.out.println("The year is a Leap Year");//2008
    }
    else {
        System.out.println("The year is not a Leap Year");//1989
    }

    }
}
