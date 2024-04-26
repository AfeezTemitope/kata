import java.util.Scanner;

public class PurchaseCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************");
        System.out.println("Welcome to E-Store: ");
	System.out.println("********************");

        
        System.out.print("Please enter Customer Name: ");
        String customerName = scanner.nextLine();

       
        double totalCost = 0;
        double discountedCost;

        
        for (int i = 1; i <= 3; i++) {
            System.out.print("What is the name of item " + i + ": ");
            String itemName = scanner.nextLine();
            System.out.print("How much is it: ");
            double itemCost = scanner.nextDouble();
            scanner.nextLine();

            totalCost += itemCost;
        }
	discountedCost = totalCost - (totalCost * 10)/100;


       
        System.out.println("\nCustomer Name: " + customerName + "\n");
        System.out.print("\nTotal\t\titemCost");
	
	System.out.printf("\nTotal cost: %.2f%n", totalCost);
	for (int i = 0; i < 3; i++){
	String itemName = scanner.nextLine();
	double itemCost = scanner.nextDouble();
	System.out.printf(itemName, itemCost);
}
	if (totalCost >= 200) {
            	System.out.print("Discounted cost " + discountedCost);
        } else {
		System.out.print("no discount");
        }
	System.out.println("\nThanks for your patronage!");
    }
}
