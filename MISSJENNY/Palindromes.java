import java.util.Scanner;
public class Palindromes{
public static void main (String[]args){
Scanner scanner = new Scanner(System.in);

System.out.println("enter first number: ");
int digit = scanner.nextInt();

int count = 0;
int normalDigit = digit;
int reverseDigit = 0;

while (digit > 0){
int calculate = digit % 10;
int reverseDidit = ( reverseDigit * 10) + calculate;
digit = digit/10;
}
 if (normalDigit == reverseDigit){
System.out.print("This is a palindromes");
} 
else {
System.out.print("This is not a palindromes");
}

}
}