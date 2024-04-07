import java.util.Scanner;

public class Factorial{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);

	System.out.println("enter a number");
	int number = scanner.nextInt();

	long result = Kata.factorial(number);
	System.out.print(result);

}

}