import java.util.*;

 public class PartTwoArray{
   public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
int n = 5;
int UserInput;
List <Object> age = new ArrayList<>();

for ( int i = 0; i < n; i++){
System.out.print("enter age: " + ( i + 1) + " :");
UserInput = scanner.nextInt();
age.add( UserInput ); 
}
for ( Object item : age ){

System.out.print(item + " " );
}

   }
 }