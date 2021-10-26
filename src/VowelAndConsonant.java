import java.util.Scanner;
//Question 16) Wap that takes the user to provide a single character from the alphabet.
// Print vowel or Consonant,depending on the user input.
//For eg: Input an alphabet: p
//        Expected Output: Input letter is Consonant
public class VowelAndConsonant {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Input an Alphabet - ");
    char alpha = scan.next().charAt(0);

    if ((alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' || alpha == 'A' || alpha =='E' || alpha == 'I' || alpha == 'O' || alpha == 'U'))
    {
        System.out.println("Input letters is a Vowel.");
    }
    else
    {
        System.out.println("Input letter is a Consonant.");
    }
    }
}
