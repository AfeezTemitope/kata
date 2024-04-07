import java.util.Scanner;

public class Factor{
public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = scanner.nextInt();
		int result = Kata.factor(a);
		System.out.print(result);



}
}