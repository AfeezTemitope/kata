import java.util.Scanner;
public class Minimum{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);

System.out.print("enter a value  ");
int number = scanner.nextInt();
int[] array = new int[number];

for (int i = 0; i < number; i++){
System.out.print("enter integer " + (i + 1) + ":"); 
array[i] = scanner.nextInt();
}

int minimum = ArrayKata.minimum(array);

System.out.print("the minimum value of this array is " + minimum);
		


}
}

