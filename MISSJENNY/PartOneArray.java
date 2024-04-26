import java.util.*;

 public class PartOneArray{
   public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
int n = 5;
String UserInput;
List <String> name = new ArrayList<>();

for ( int i = 0; i < n; i++){
System.out.print("enter name: " + ( i + 1) + " :");
UserInput = scanner.nextLine();
name.add( UserInput ); 
}
for ( String item : name ){

System.out.print(item + " " );
}

   }
 }