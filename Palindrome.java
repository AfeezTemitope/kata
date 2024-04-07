import java.util.Scanner;
public class Palindrome{
public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.println("***********************");
System.out.println("WELCOME TO PALINDROMES");
System.out.println("***********************");
System.out.println("enter a number between 1000 - 9999: ");
int userNumber = input.nextInt();

boolean result = Kata.isPalindromes(userNumber);
System.out.print(result);

}
}