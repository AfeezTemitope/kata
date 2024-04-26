import java.util.Scanner;

 public class CalculatorApp{

   public static void main(String [] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter customer name:");
    String name = scanner.nextLine();


    int counter = 0;
    int totalAmount = 0;

  while(counter < 10) {
    System.out.print("Enter items amount:");
    int amount = scanner.nextInt();

    totalAmount += amount;

    counter++;
     }

   double discountRate = 0.1;
   double discount = totalAmount * discountRate;
   double discountedAmount = totalAmount - discount;
   
 
   if(totalAmount > 200) {
      System.out.println(discountedAmount);
        } else {
     System.out.println("no discount added");
     }

    
System.out.println("Customer name:" + name);
System.out.println("Original cost:" + totalAmount);
System.out.println("Thanks for your patronage!");

}

}