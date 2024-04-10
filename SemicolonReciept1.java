import java.util.*;
public class SemicolonReciept1 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> item = new ArrayList<>();

        String customerName;
        String userItem;
        int quantity;
        int priceOfOneItem;
        String continueShopping;
	int totalPrice = 0;
	

        
            System.out.print("Customer name: ");
            customerName = scanner.nextLine();
do{
            System.out.print("What did you want to buy? ");
            userItem = scanner.nextLine();

            System.out.print("How many pieces: ");
            quantity = scanner.nextInt();

            System.out.print("How much per unit: ");
            priceOfOneItem = scanner.nextInt();
	    totalPrice += priceOfOneItem * quantity;
            scanner.nextLine(); 
	    
		
            item.add(new Product(userItem, quantity, priceOfOneItem));


            System.out.print("Do you want to buy something else? (yes/no): ");
            continueShopping = scanner.nextLine();

        } while (continueShopping.equalsIgnoreCase("yes"));

        System.out.println("******************");
        System.out.println("SEMICOLON  STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343");
        System.out.println("******************");
        System.out.println("CASHIER: Cashier's Name\n" + "CUSTOMER NAME: " + " " + customerName +"\t");
        System.out.println("******************");
	
	System.out.println("QTY\tPRICE\tITEM-NAME\tTOTAL-PRICE");
        for (Product product : item) {
            
	    
            System.out.println(product.quantity + "\t" + product.price + "\t" + product.name + "\t" + "\t" + product.price * product.quantity);
	     System.out.println("****************************************");
        }
	double discount = totalPrice - ( totalPrice * 0.75)/100;
  System.out.println("SubTotal: " + totalPrice); 
  System.out.println("Discounted Price: " + discount); 
    }
}
