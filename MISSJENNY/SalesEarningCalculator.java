import java.util.*;

public class SalesEarningsCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter salesperson's name: ");
String salespersonName = input.nextLine();

System.out.print("Enter number of items sold: ");
int itemsSold = input.nextInt();

double earnings = calculateEarnings(itemsSold);

System.out.println(salespersonName + "'s earnings for last week: " + earnings);




        
}