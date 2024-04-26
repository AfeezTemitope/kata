import java.util.Scanner;
     public class Investment {

     public static void main(String[] args){

     Scanner scanner = new Scanner(System.in);

System.out.println("Enter the value for INVESTMENT AMOUNT: ");
double investmentAmount = scanner.nextDouble();

System.out.println("Enter the value for ANNUAL INTEREST RATE%: ");
double annualInterestRate = scanner.nextDouble();

System.out.println("Enter the value for NUMBER OF YEARS");
int numberOfYears = scanner.nextInt();

double futureInvestmentValue = investmentAmount * Math.pow((1 + annualInterestRate/100), numberOfYears*12);



System.out.printf("the future value is:  $%.2f%n", futureInvestmentValue);


}
}