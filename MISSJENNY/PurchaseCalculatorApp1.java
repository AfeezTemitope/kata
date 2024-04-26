import java.util.Scanner;

public class PurchaseCalculatorApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************");
        System.out.println("Welcome to E-Store:");
        System.out.println("********************");

        
        System.out.print("Please enter Customer Name: ");
        String customerName = scanner.nextLine();

        double totalCost = 0;
        double discountedCost;

        String[] itemNames = new String[3];
        double[] itemCosts = new double[3];

        // Get item details
        for (int i = 0; i < 3; i++) {
            System.out.print("What is the name of item " + (i + 1) + ": ");
            itemNames[i] = scanner.nextLine();
            System.out.print("How much is it: ");
            itemCosts[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            totalCost += itemCosts[i];
        }

        
        if (totalCost >= 200) {
            discountedCost = totalCost * 0.9;
        } else {
            discountedCost = totalCost;
        }

        
        System.out.println("\nCustomer Name: " + customerName);
        System.out.println("\nTotal item\t\tcost");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-20s %.2f%n", itemNames[i], itemCosts[i]);
        }

        
        System.out.printf("\nTotal cost: %.2f%n", totalCost);
        if (totalCost >= 200) {
            System.out.printf("Discounted cost: %.2f%n", discountedCost);
        } else {
            System.out.println("No discount applied.");
        }

       
        System.out.println("\nThanks for your patronage!");
    }
}
