import java.util.Scanner;
public class ConvertPing{
public static void main(String[]args){
Scanner scanner = new Scanner (System.in);

System.out.println("ENTER SQUARE IN PING");
double square = scanner.nextDouble();

double ConstantValueToConvertToPing = 0.3025;

double squareMeter = square * ConstantValueToConvertToPing;
System.out.printf("Squaremeter is %.2f", squareMeter);
}
}

