import java.util.Scanner;
public class IsSumEven{
public static void main(String... args){
Scanner scanner = new Scanner(System.in);

System.out.print("enter a value  ");
int number = scanner.nextInt();
int[] array = new int[number];

for (int i = 0; i < number; i++){
System.out.print("enter integer " ); 
array[i] = scanner.nextInt();
}

int sum = ArrayKata.isSumEven(array);

System.out.print( sum);
		


}
}

