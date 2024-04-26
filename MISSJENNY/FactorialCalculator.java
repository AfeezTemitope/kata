import java.util.Scanner;

public class FactorialCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a non-negative integer: ");
int num = scanner.nextInt();

if (num < 0) {

System.out.println("Factorial is not defined for negative numbers.");
       
} else {
long factorial = calculateFactorial(num);
System.out.println("The factorial of " + num + " is " + factorial);
}

scanner.close();
}

private static long calculateFactorial(int n) {

if (n == 0) {
return 1;
} else {
long result = 1;
for (int i = 1; i <= n; i++) {
result *= i;
}

return result;
}
}
}
