import java.util.Scanner;
//Question 6) Wap to input employee is, name, basic slary then find HRA,TA,DA,PF and Gross Salary
//HRA = basic salary 10%
//DA = basic salary 8%
//TA = basic salary 9%
//PF = basic salary 20%
//Gross salary = basic salary + HRA + TA + DA + -PF
public class GrossSalary {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.print("Employee ID - ");
    String id = scan.nextLine();

    System.out.print("Name - ");
    String name = scan.nextLine();

    System.out.print("Basic Salary - ");
    int salary = scan.nextInt();

    float hra = (float) salary * 10 / 100;
    float da =  (float) salary * 8 / 100;
    float ta =  (float) salary * 9 / 100;
    float pf =  (float) salary * 20 / 100;

    System.out.println("HRA = " + (salary * 10) / 100);
    System.out.println("DA = " + (salary * 8) / 100);
    System.out.println("TA = " + (salary * 9) / 100);
    System.out.println("PF = " + (salary * 20) / 100);
    System.out.println("Gross Salary = " + (salary + hra + ta + da -pf));
    }
}
