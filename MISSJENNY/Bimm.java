import java.util.Scanner;

public class Bimm{
public static void main(String[]args){
Scanner scanner = new Scanner (System.in);

System.out.println("ENTER VALUE FOR WEIGHT");
double weight = scanner.nextDouble();

System.out.println("ENTER VALUE FOR HEIGHT");
double height = scanner.nextDouble();

double constantValueForConvertingKilogram = 0.452;
double constantValueForConvertingPound = 0.025;
double weightInKilogram = weight * constantValueForConvertingKilogram;
double heightInInches = height * constantValueForConvertingPound;

double bmi = weight / (height * height);

System.out.printf("bmi is  %.3f%n", bmi);

}

}