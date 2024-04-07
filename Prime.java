import java.util.Scanner;
public class Prime{
public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.println("enter a number  ");
int number = input.nextInt();

boolean result = Kata.isPrime(number);
System.out.print("is " + number + " a prime number? " + result);

}
}