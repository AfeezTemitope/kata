import java.util.Scanner;
     public class CostOfDriving {

     public static void main(String[] args){

     Scanner scanner = new Scanner(System.in);
     
     System.out.println("ENTER DRIVING DISTANCE: ");
      double distance = scanner.nextDouble();

     System.out.println("ENTER MILES PER GALLON: ");
      double miles = scanner.nextDouble();

     System.out.println("ENTER PRICE PER GALLON: ");
      double price = scanner.nextDouble();
     
     double cost = price * (distance / miles);
     

    System.out.printf("the cost of driving is $%.2f%n", cost);





}

}