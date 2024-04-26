import java.util.*;

 public class PartOneArraya{
   public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
int n = 5;
String UserInput;
String [] arr = new String [n];



for ( int i = 0; i < n; i++){
System.out.print("enter name: " + ( i + 1) + " :");
arr [i] = scanner.nextLine();
}
for ( int j = 0; j < arr.length; j++ ){

System.out.print(arr[j] + " " );
}

   }
 }