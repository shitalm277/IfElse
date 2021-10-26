import java.util.Scanner;
//WAP input sales id, seller's name, sales amount, basic salary and then find this sales commission
//sales amount >=50,000 35%
//sales amount >=30,000 20%
//             >= 20,000 10%
//             >= 10,000 5%
//             < 10,000 2%
public class SalesCommission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sale's ID - ");
        String id = scan.nextLine();

        System.out.print("Seller's Name - ");
        String name = scan.nextLine();

        System.out.print("Sales Amount - ");
        int amount = scan.nextInt();

        System.out.print("Basic Salary - ");
        int salary = scan.nextInt();

        if (amount >= 50000)
        {
            float commission = (float) (amount * 35) / 100;
            System.out.println("The Sales Commission is -  " + commission);
        }
        else if (amount >= 30000)
        {
            float commission = (float) (amount * 20) /100;
            System.out.println("The Sales Commission is - " + commission);
        }
        else if (amount >= 20000)
        {
            float commission = (float) (amount * 10) / 100;
            System.out.println("The Sales Commission is - " + commission);
        }
        else if (amount >= 10000)
        {
            float commission = (float) (amount * 5) / 100;
            System.out.println("The Sales Commission is - " + commission);
        }
        else if (amount < 10000)
        {
            float commission = (float)(amount * 2) / 100;
            System.out.println("The Sales Commission is - " + commission);
        }
        }
}