import java.util.*;

 public class PartThreeArray{
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

student.add( UserInput + " " + grade + ",");

}
for ( Object item : student ){
System.out.print(item + " ");
}
   }
 }