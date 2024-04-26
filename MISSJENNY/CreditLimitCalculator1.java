import java.util.Scanner;

public class CreditLimitCalculator1 {
public static void main(String[] args) {
Scanner afeez = new Scanner(System.in);

System.out.println("Enter account number: ");
int accountNumber = afeez.nextInt();

System.out.println("Enter balance at the beginning of the month: ");
int balance = afeez.nextInt();

System.out.println("Enter total of all items charged this month: ");
int charges = afeez.nextInt();

System.out.println("Enter total of all credits applied this month: ");
int credits = afeez.nextInt();

System.out.println("Enter allowed credit limit: ");
int creditLimit = afeez.nextInt();

int newBalance = balance + charges - credits;

if (newBalance > creditLimit) {
System.out.println("Credit limit exceeded for account number " + accountNumber);
System.out.printf("Current balance:- %d%n", newBalance);
System.out.printf("Allowed credit limit:- %d%n", creditLimit);

}

else {
System.out.println("Credit limit not exceeded for account number " + accountNumber);
System.out.printf("Current balance:- %d%n", newBalance);
System.out.printf("Allowed credit limit:- %d%n", creditLimit);
        }

      
}
}