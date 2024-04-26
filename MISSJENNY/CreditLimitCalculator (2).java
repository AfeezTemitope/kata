import java.util.Scanner;

public class CreditLimitCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter account number: ");
int accountNumber = input.nextInt();

System.out.println("Enter balance at the beginning of the month: ");
double balance = input.nextDouble();

System.out.println("Enter total of all items charged this month: ");
double charges = input.nextDouble();

System.out.println("Enter total of all credits applied this month: ");
double credits = input.nextDouble();

System.out.println("Enter allowed credit limit: ");
double creditLimit = input.nextDouble();

double newBalance = balance + charges - credits;

if (newBalance > creditLimit) {
System.out.println("Credit limit exceeded for account number " + accountNumber);
System.out.printf("Current balance:- %.2f\n", newBalance);
System.out.printf("Allowed credit limit:- %.2f\n", creditLimit);

}

else {
System.out.println("Credit limit not exceeded for account number " + accountNumber);
System.out.printf("Current balance:- %.2f\n", newBalance);
System.out.printf("Allowed credit limit:- %.2f\n", creditLimit);
        }

      
}
}