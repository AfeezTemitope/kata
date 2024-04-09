import java.util.Scanner;

public class IsOdd{
public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scanner.nextInt();
		int [] array = new int[number];

		for (int i = 0; i < number; i++){
		System.out.print("enter number" +( i + 1) + ":");
		array[i] = scanner.nextInt();
		}

		int result = ArrayKata.isOdd(array);
		System.out.print("the odd number is " + result);


}
}
