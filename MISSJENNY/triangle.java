import java.util.Scanner;
public class Triangle{
public static void main(String[]args){
Scanner scanner = new Scanner (System.in);

System.out.print("Enter the length of the base (1-10): ");
int baseLength = scanner.nextInt();
if (baseLength < 1 || baseLength > 10) {

System.out.println("Base length must be between 1 and 10.");
return;
}
for (int i = 1; i <= baseLength; i++) {
for (int j = 1; j <= i; j++) {
System.out.print("*");
}
System.out.println();
}
}
}