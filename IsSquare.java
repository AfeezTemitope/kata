import java.util.Scanner;

public class IsSquare{
public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scanner.nextInt();
		int [] array = new int[number];
		boolean result = ArrayKata.isSquare(number);
		System.out.print(result);



}
}