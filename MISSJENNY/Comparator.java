import java.util.Scanner;
public class Comparator{
public static void main (String[]args) {
Scanner scanner = new Scanner(System.in);

System.out.print("enter first number:  ");
int firstNumber = scanner.nextInt();

System.out.print("enter second number: ");
int secondNumber = scanner.nextInt();

if (firstNumber == secondNumber){
System.out.print("0");
}

if (firstNumber > secondNumber){
System.out.print("1");
}

if (secondNumber > firstNumber){
System.out.print("-1");
}

}
}

