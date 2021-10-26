import java.util.Scanner;
//Question 8) Wap to input any number and find out if it is positive, negative or zero.
public class PositiveNegative {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to check - ");
        int number = scan.nextInt();
        if (number > 0)
        {
            System.out.println(number + " is the positive number");
        } else if(number<0)
        {
            System.out.println(number + " is the negative number");
        }
        else
        {
            System.out.println(number + " is neither positive or negative. It's a Zero");
        }


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the number you want to check - ");
        int number1 = scan1.nextInt();
        if (number1 > 0)
        {
            System.out.println(number1 + " is the positive number");
        } else if(number1<0)
        {
            System.out.println(number1 + " is the negative number");
        }
        else
        {
            System.out.println(number1 + " is neither positive or negative. It's a Zero");
        }


        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the number you want to check - ");
        int number2 = scan2.nextInt();
        if (number2 > 0)
        {
            System.out.println(number2 + " is the positive number");
        } else if(number2<0)
        {
            System.out.println(number2 + " is the negative number");
        }
        else
        {
            System.out.println(number2 + " is neither positive or negative. It's a Zero");
        }
    }
}
