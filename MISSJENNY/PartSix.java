import java.util.Scanner;

public class PartSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************");
        System.out.println("Welcome to E-Store:");
        System.out.println("***abido shaker eStore***");

	System.out.print("please enter customers Name: ");
	String name = scanner.nextLine();

	String[] itemNames = new String[3];	
	double[] cost = new double[3];
	
	int totalCost = 0;

	for(int i = 0; i < 3; i++){
		System.out.print("item name " + (i +1) + ":");
		itemNames[i] = scanner.nextLine();
		System.out.print("cost: ");
		cost[i] = scanner.nextDouble();
		scanner.nextLine();

		totalCost += cost[i];
}
	System.out.println("Customer name: " + name);
	System.out.println("ITEM-NAME\t\tCOST");
	for (int i = 0; i < 3; i++){
		System.out.printf("%-20s %.2f%n", itemNames[i], cost[i]);
}
	System.out.print("\nTotal-Cost: " + totalCost);
	if(totalCost >= 200){
		int discount = totalCost - ( totalCost * 10/100);
		System.out.print("\nDiscounted-Cost: " + discount);
	} else {
		System.out.print("\nNO FUCKING DISCOUNT");
}

}
}
		