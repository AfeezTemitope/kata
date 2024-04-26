import java.util.Scanner;

public class PartTwo {
public static void main(String... args) {
Scanner input = new Scanner(System.in);
        int sum = 0;
        double discount = 0;
        double discountedPrice = 0;
	int numItems = 0;
	String name;
	int counter = 0;
	int i = 0;

        System.out.println("<**********>");
        System.out.println("WELCOME TO E-STORE");
        System.out.println("<**********>");

       
        System.out.print("Please Enter Customer Name: ");
        name = input.nextLine();

       
        System.out.print("Please enter number of items purchased: ");
        numItems = input.nextInt();

        
        System.out.print("Please Enter percentage discount: ");
        discount = input.nextDouble();


        while ( i < numItems) {
            System.out.print("Please Enter cost for item  " + (i + 1) + ": ");
            int cost = input.nextInt();
	    
            sum += cost;
        i++;
	   }
	    discountedPrice = sum - (sum * discount / 100);

            System.out.println("Customer Name: " + name);
            System.out.println("Number of items bought: " + numItems);
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
