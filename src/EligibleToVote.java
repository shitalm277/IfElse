import java.util.Scanner;
//Question 11) Wap to allow the user to input his/her age. Then the program will show if the person is eligible to vote.
//A person who is eligible to vote must be older than or equal to 18 years old.
public class EligibleToVote {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the Age - ");
    int age = scan.nextInt();

    if (age >= 18)
    {
        System.out.println("The person is Eligible to Vote");
    }
    else
    {
        System.out.println("You are not Eligible to Vote.");
    }
    }
}
