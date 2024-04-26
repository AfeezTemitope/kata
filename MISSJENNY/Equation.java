import java.util.Scanner;

public class QuadraticEquation{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.print("enter value for A: ");
double a = input.nextDouble();

System.out.print("enter value for B: ");
double b = input.nextDouble();

System.out.print("enter value for C: ");
double c = input.nextDouble();

double numerator = b * b - 4.0 * a * c;
double denominator = 2 * a;
double quadraticEquation = (- b - Math.sqrt(numerator)) / denominator;
double quadraticEquation1 = (- b + Math.sqrt(numerator)) / denominator;

System.out.printf("your answer is :" + quadraticEquation  + "or" + quadraticEquation1);

}
}


