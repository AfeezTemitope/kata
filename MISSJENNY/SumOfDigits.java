import java.util.Scanner;
public class SumOfDigits{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the number between 0 and 1000: ");  
int number = scanner.nextInt(); 

int firstDigit = number%10;
int secondDigit = firstDigit%10;
int thirdDigit = number%10;
int total =  secondDigit +  firstDigit +  thirdDigit;


System.out.printf("sum of digits is: %d ", total);  
}  
}

