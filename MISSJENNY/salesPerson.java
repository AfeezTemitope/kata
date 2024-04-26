import java.util.Scanner;
public class SalesPerson {
public static void main(String[]args){
Scanner scanner = new Scanner (System.in);

System.out.println(" Enter sales person gross sales; ");
int sales = scanner.nextInt();

double salary = 200 + sales * 0.09;

System.out.printf("salesPerson earnings %.2f%n", salary);


}
}