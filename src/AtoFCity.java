import java.util.Scanner;
//Question 10) Input any alphabet from a to f and print their city name accordingly (use if else) any other alphabet should be invalid entry.
public class AtoFCity {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an Alphabet - ");
    char alpha = scan.nextLine().charAt(0);

    if (alpha == 'a' || alpha == 'A')
        {
            System.out.print("Aurangabad");
        }
    else if (alpha == 'b' || alpha == 'B')
    {
        System.out.print("Bareily");
    }
    else if (alpha == 'c' || alpha == 'C')
    {
        System.out.println("Chandigarh");
    }
    else if (alpha == 'd' || alpha == 'D')
    {
        System.out.print("Dispur");
    }
    else if (alpha == 'e' || alpha == 'E')
    {
        System.out.print("Ellora");
    }
    else if (alpha == 'f' || alpha == 'F')
    {
        System.out.print("Fatehpur");
    }
     else
    {
        System.out.println("The keyword you have entered is Invalid");
    }
    }
}
