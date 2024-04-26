import java.util.*;

 public class PartFourArray{
   public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
int n = 5;
String UserInput;
int grade = 0;
List <Object> student = new ArrayList<>();

for ( int i = 0; i < n; i++){
System.out.print("enter student name: " + ( i + 1) + " :");
UserInput = scanner.nextLine();

System.out.print("enter student grade: " + ( i + 1) + " :");
grade = scanner.nextInt();

scanner.nextLine();


student.add( UserInput + "\t" + "\t" + grade + "\n");

}
System.out.print("Student names" + " " + "\tScore");
for ( Object item : student ){
System.out.print("\n" + item + " ");
}
   }
 }