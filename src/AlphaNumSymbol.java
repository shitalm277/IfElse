import java.util.Scanner;
//Question 14) Enter any value and then find out if it is a number(0-9), an alphabet or a symbol.
public class AlphaNumSymbol {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value - ");
        String number = String.valueOf(scan.next().charAt(0));
        if(number.matches("[0-9]") || number.matches("-[0-9]")){
            System.out.println("This is a number");
        }
        else if (number.matches("[a-zA-Z]")){
            System.out.println("This is an alphabet");
        }
        else{
            System.out.println("This is a special character");
        }


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the Value - ");
        String number2 = String.valueOf(scan1.next().charAt(0));
        if(number2.matches("[0-9]") || number2.matches("-[0-9]")){
            System.out.println("This is a number");
        }
        else if (number2.matches("[a-zA-Z]")){
            System.out.println("This is an alphabet");
        }
        else{
            System.out.println("This is a special character");
        }


        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the Value - ");
        String number3 = String.valueOf(scan2.next().charAt(0));
        if(number3.matches("[0-9]") || number3.matches("-[0-9]")){
            System.out.println("This is a number");
        }
        else if (number3.matches("[a-zA-Z]")){
            System.out.println("This is an alphabet");
        }
        else{
            System.out.println("This is a special character");
        }


    }


}
