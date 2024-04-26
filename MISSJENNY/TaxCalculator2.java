import java.util.Scanner;

public class TaxCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

for (int i = 1; i <= 3; i++) {
System.out.println("Enter citizen " + i + "::");
String name = input.nextLine();

System.out.println("Enter earnings for the year:");
double earnings = input.nextDouble();

double tax = calculateTax(earnings);
            
System.out.println(name + "'s total tax: $" + tax);

private static calculateTax{
double tax;
double ceiling = 30000.0;
double taxRate1 = 0.15;

if (earnings <= ceiling) {
tax = earnings * taxRate1;

} else {

double excessEarnings = earnings - ceiling;
double taxRate2 = 0.20;
tax = ceiling * taxRate1 + excessEarnings * taxRate2;
        
}

 return tax;       
    
}
}


}