import java.util.Scanner;
public static void main(String[]args){
public class Bim{
Scanner scanner = new Scanner (System.in);
System.out.println("ENTER VALUE FOR WEIGHT");
double weight = scanner.nextdouble();
System.out.println("ENTER VALUE FOR HEIGHT");
double height = scanner.nextdouble();




double constantValueForConvertingKilogram = 0.452
double constantValueForConvertingPound = 0.025
double weightInKilogram = weight * constantValueForConvertingKilogram;
double heightInInches = height * constantValueForConvertingPound;

double bmi = weight / (height * height);

System.out.printf("bim is " %.3f);

}



}