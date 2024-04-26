import java.util.Scanner;
public class Calculator{
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
int totalMiles = 0;
int totalGallon = 0;
int trips = 0;

System.out.println("Enter miles driven for each trip: ");
int miles = scanner.nextInt();

while (miles != -1){

System.out.println("Enter gallon used for this trip: ");
int gallon = scanner.nextInt();

double mPg = miles / gallon;

totalMiles += miles;
totalGallon += gallon;
trips++;

System.out.printf("Miles per gallon for this trip is:- %.2f%n",mPg);
}



}
}