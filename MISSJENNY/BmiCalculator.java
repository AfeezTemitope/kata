import java.util.Scanner;
public class BmiCalculator{
public static void main(String[]args){
Scanner input = new Scanner (System.in);


System.out.print("ENTER WEIGHT IN POUNDS: ");
double weightPounds = Scanner.nextDouble();

System.out.print("ENTER HEIGHT IN INCHES: ");
double heightInches = Scanner.nextDouble();

double Bmi= weightPounds / heightInches;
System.out.println("BmiCalculator");

        
double weightKg = weightPounds * 0.453592;
        
double heightMeters = heightInches * 0.0254;
bmi = weightPounds / (heightMeters * heightMeters);

}
}


   
 