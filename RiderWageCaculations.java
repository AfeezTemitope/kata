import java.util.*;
	public class RiderWageCaculations{
		public static void main(String...args){
			Scanner scanner = new Scanner(System.in);
			


	System.out.println("enter number of succesful deliveries :");
	int successfulDeliveries = scanner.nextInt();

	int ridersPayment = RidersWage.calculateRiderWage(successfulDeliveries);
	if ( successfulDeliveries >= 100 ){
		System.out.println("Test successful " + ridersPayment);
	} else { 
	      System.out.println("Test failed " + ridersPayment);




	}






	}
		}