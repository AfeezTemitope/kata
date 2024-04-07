import java.util.Scanner;
public class Even{
public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.println("enter a number  ");
int number = input.nextInt();

boolean result = Kata.isEven(number);
System.out.print("is " + number + " an even number? " + result);

}
}