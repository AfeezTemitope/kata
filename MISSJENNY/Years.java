import java.util.Scanner;
public class Years{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);
System.out.print("ENTER VALUE OF MINUTE");
int minute = scanner.nextInt();

int year = minute / 525600;
int remainder = minute % 525600;
int day = remainder / 1440;


System.out.printf("%d minute is approximately %d year %d day ", minute, year, day);

}
}
