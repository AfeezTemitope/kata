import java.util.*;

public class RiderWageCaculations{
    public static void main(String...args){
        Scanner scanner = new Scanner(System.in);    
        List<Integer> rider = new ArrayList<>();
        
        String continueInput = "Y";

        while (continueInput.equalsIgnoreCase("Y")){

            System.out.println("Enter number of successful deliveries:");
            int successfulDeliveries = scanner.nextInt();
            scanner.nextLine();
            
            rider.add(successfulDeliveries);

            int ridersPayment = RidersWage.calculateRiderWage(successfulDeliveries);
            if (successfulDeliveries >= 100){
                System.out.println("Test successful " + ridersPayment);
            } else { 
                System.out.println("Test failed " + ridersPayment);
            }
            System.out.println("Do you want to enter more deliveries? (y/n)");
            continueInput = scanner.nextLine();
        }
    }
}
