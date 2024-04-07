import java.util.Scanner;

public class Square{
public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scanner.nextInt();
		boolean result = Kata.square(number);
		System.out.print(result);



}
}