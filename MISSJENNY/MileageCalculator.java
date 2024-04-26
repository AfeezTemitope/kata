import java.util.Scanner;

public class MileageCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int totalMiles = 0;
int totalGallons = 0;

System.out.println("Enter miles driven:=  ");
int miles = scanner.nextInt();

System.out.println("Enter gallons used: ");
int gallons = scanner.nextInt();

double milePerGallon = miles / gallons;

totalMiles += miles;
totalGallons += gallons;

System.out.printf("milePerGallon for this trip: %.2f%n", milePerGallon);
        
double overallMilePerGallon = totalMiles / totalGallons;
System.out.printf("Overall average milePerGallon: %.2f%n", overallMilePerGallon);
}
}