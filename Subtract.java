import java.util.Scanner;

public class Subtract{
public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number a : ");
		int a = scanner.nextInt();

		System.out.println("Enter number b: ");
		int b = scanner.nextInt();
		
		int result = Kata.subtract(a, b);
		System.out.print( result);



}
}