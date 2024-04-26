import java.util.Scanner;

public class TaxCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

for (int i = 1; i <= 3; i++) {
System.out.println("Enter citizen " + i + ":");
String name = input.nextLine();
}

System.out.println("Enter earnings for the year:");
double earnings = input.nextDouble();

double tax = calculateTax(earnings);
            
System.out.println(" total tax: $" + tax);          
}
}
