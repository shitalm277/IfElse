import java.util.Scanner;
//Question 15) Wap to input any number then Print Day name of the week accordingly by using if else.
public class DayName {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter weekday day number (1-7) : ");
        int  day = scan.nextInt();

        if(day==1)
        {
            System.out.println("Monday");
        }
        else if (day==2)
        {
            System.out.println("Tuesday");
        }
        else if (day==3)
        {
            System.out.println("Wednesday");
        }
        else if (day==4)
        {
            System.out.println("Thursday");
        }
        else if (day == 5)
        {
            System.out.println("Friday");
        }
        else if  (day == 6)
        {
            System.out.println("Saturday");
        }
        else if (day==7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("The number you have entered is Invalid");
        }

    }
}
