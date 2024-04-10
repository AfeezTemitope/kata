import java.util.Scanner;

public class SemicolonReciept {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        String customerName;
        String userItem;
        int quantity;
        int priceOfOneItem;
        String continueShopping;

        do {
            System.out.print("Customer name: ");
            customerName = scanner.nextLine();

            System.out.print("What did you want to buy? ");
            userItem = scanner.nextLine();

            System.out.print("How many pieces: ");
            quantity = scanner.nextInt();

            System.out.print("How much per unit: ");
            priceOfOneItem = scanner.nextInt();
	    System.out.println("******************");
	    System.out.println("SEMICOLON  STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343");
	    System.out.println("******************");
            System.out.println("CASHIER: Cashier's Name\n" + "CUSTOMER NAME: " + " " + customerName +"\t");

	    System.out.println("                  ");
	    System.out.println("******************");
            System.out.println("QTY\tPRICE\tITEM-NAME");
            System.out.println(quantity + "\t" + priceOfOneItem + "\t" + userItem);
	    
            System.out.print("Do you want to buy something else? (yes/no): ");
            scanner.nextLine(); 
            continueShopping = scanner.nextLine();

        } while (continueShopping.equalsIgnoreCase("yes"));
    }
}
