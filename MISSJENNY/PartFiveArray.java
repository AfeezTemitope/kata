import java.util.*;

 public class PartFiveArray{
   public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
int n = 5;
String UserInput;
int totalScore = 0;
int grade = 0;
int average = 0;
List <Object> student = new ArrayList<>();

for ( int i = 0; i < n; i++){
System.out.print("enter student name: " + ( i + 1) + " :");
UserInput = scanner.nextLine();

System.out.print("enter student grade: " + ( i + 1) + " :");
grade = scanner.nextInt();
totalScore+= grade;
average = totalScore / 5;

scanner.nextLine();


student.add( UserInput + "\t" + "\t" + grade + "\n");

}
System.out.print("Student names" + " " + "\tScore");
for ( Object item : student ){
System.out.print("\n" + item + " ");
}
System.out.println("The total score is: " + totalScore);
System.out.println("The average score is: " + average);
   }
 }