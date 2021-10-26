import java.util.Scanner;
//Question 13) Wap to input any two number and ask user to enter their symbol (+, -, *, /) find addition, substraction, multiplication,
//and division according to their symbol (using if else).
public class CalculateWithSymbol {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your First number - ");
    int number1 = scan.nextInt();
    System.out.print("Enter your Second number - ");
    int number2 = scan.nextInt();
    System.out.print("Enter any Symbol you want - ");
    char symbol = scan.next().charAt(0);
    if (symbol == '+')
    {
        System.out.println("Total of First and Second number is = " + (number1 + number2));
    }
    else if (symbol == '-')
        {
            System.out.println("Substraction of First and Second number is = " + (number1 - number2));
        }
    else if (symbol == '*')
    {
        System.out.println("Multiplication of First and Second number is = " + (number1 * number2));
    }
    else if (symbol == '/')
    {
        System.out.println("Division of First and Second number is = " + (number1 / number2));
    }
    }
}
