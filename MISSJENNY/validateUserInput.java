import java.util.Scanner;
public class validateUserInput{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int userDigit;
while (true) {
System.out.print("Enter 1  2 or 3: ");
userDigit = scanner.nextInt();

if (userDigit == 1 || userDigit == 2 || userDigit == 3) {
break; 
} else {
System.out.println("Invalid input. Please enter 1  2 or 3.");            }
}
System.out.println("You entered a correct value: " + userDigit);
}
}