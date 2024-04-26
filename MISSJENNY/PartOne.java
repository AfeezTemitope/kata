import java.util.Scanner;

public class PartOne {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        double discount = 10;
        double discountedPrice = 0;

        System.out.println("<**********>");
        System.out.println("WELCOME TO E-STORE");
        System.out.println("<**********>");

        System.out.print("Please Enter Name: ");
        String name = input.nextLine();

        System.out.println("Please enter cost of items:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            int cost = input.nextInt();
            sum += cost;
        }

        if (sum >= 200) {
            discountedPrice = sum - (sum * discount / 100);
            System.out.printf("Discounted cost: %.2f%n", discountedPrice);
        } else {
            System.out.println("No discount applied. Discounted cost: 0");
        }

        System.out.println("Original Cost: " + sum);
        System.out.println("Customer Name: " + name);  
        System.out.println("Thanks for your patronage!");
    }
}
