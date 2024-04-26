import java.util.Scanner;

public class PartThree {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        double discount = 0;
        double discountedPrice = 0;
        int numItems = 0;
        String name;
        int counter = 0;
	

        System.out.println("<**********>");
        System.out.println("WELCOME TO E-STORE");
        System.out.println("<**********>");

        System.out.print("Please Enter Customer Name: ");
        name = input.nextLine();

        System.out.print("Please Enter percentage discount: ");
        discount = input.nextDouble();
	


        while (true) {
	    
            System.out.print("Please Enter cost for item " + (counter + 1) + " or -1 to quit: ");
            int cost = input.nextInt();
            if (cost == -1) {
                break;
            }
            sum += cost;
 counter++;           
        }

	
        discountedPrice = sum - (sum * discount / 100);

        System.out.println("Customer Name: " + name);
        System.out.println("Number of items bought: " + counter);
        System.out.println("Percentage discount: " + discount);
        System.out.println("Original cost: " + sum);

        if (sum >= 200) {
            System.out.printf("Discounted cost: %.2f (Discount applied)%n", discountedPrice);
        } else {
            System.out.println("No discount applied.");
        }

        System.out.println("Thanks for your patronage!");
    }
}
