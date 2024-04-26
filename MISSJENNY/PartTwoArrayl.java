import java.util.*;

 public class PartTwoArrayl{
   public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
int n = 5;
String UserInput;
int [] arr = new int [n];



for ( int i = 0; i < n; i++){
System.out.print("enter age: " + ( i + 1) + " :");
arr [i] = scanner.nextInt();
}
for ( int j = 0; j < arr.length; j++ ){

System.out.print(arr[j] + " " );
}

   }
 }