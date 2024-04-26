import java.util.Scanner;

public class SalesEarningsCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter salesperson name: ");
String salespersonName = input.nextLine();

System.out.print("Enter number of items sold: ");
int itemsSold = input.nextInt();

System.out.println("Enter number of Earnings: ");
int earnings = input.nextInt();

int  calculateEarning = earnings * itemsSold;
System.out.printf("calculated earning is: %.3f%n, %s ", earnings, salespersonName );


}        

}