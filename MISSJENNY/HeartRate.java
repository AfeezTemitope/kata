
import java.util.Scanner;

public class HeartRate{
public static void main (String[]args){
Scanner input = new Scanner (System.in);



System.out.println("Enter first name:  ");
String fullName = input.nextLine();
System.out.println("Enter last name: ");
String lastName = input.nextLine();
System.out.println("Enter middle name: ");
String middleName = input.nextLine();




System.out.println("Enter month:- ");
int month = input.nextInt();
System.out.println("Enter day:-  ");
int day = input.nextInt();
System.out.println("Enter year of birth:-  ");
int years = input.nextInt();


System.out.println("ENTER CURRENT YEAR");
int currentYear = input.nextInt();

int ageInYears = currentYear - years;
int maximumHeartRate = 220 - ageInYears;
double targetedHeartRate = maximumHeartRate * 0.75;

System.out.printf("your of fullname is  %s%n %s%n  %s%n", fullName,lastName,middleName);
System.out.printf("your date of birth is month: %d% day: %d% years: %d% ", month,day,years); 
 
System.out.printf("age in  years is %d%n ", ageInYears);
System.out.printf("maximum heart rate is %d%n ", maximumHeartRate);
System.out.printf("targeted heart rate is %.3f%n ", targetedHeartRate);



}
} 






