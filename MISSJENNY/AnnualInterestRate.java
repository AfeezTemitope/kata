import java.util.Scanner;
     public class AnnualInterestRate {

     public static void main(String[] args){

     Scanner scanner = new Scanner(System.in);
System.out.println("Input value for BALANCE: ");
int balance = scanner.nextInt();

System.out.println("input value for ANNUAL INTEREST RATE; ");
double annualInterestRate = scanner.nextDouble();

double interest = balance * (annualInterestRate/1200);

System.out.printf("the interest is %.5f%n", interest);


}
}