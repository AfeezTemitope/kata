import java.util.Scanner;

public class Divide{
public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number a : ");
		int a = scanner.nextInt();

		System.out.println("Enter number b: ");
		int b = scanner.nextInt();
		
		float result = Kata.divide(a, b);
		System.out.printf("%.2f", result);



}
}