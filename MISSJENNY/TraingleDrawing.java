import java.util.Scanner;
public class TraingleDrawing {
public static void drawTraingle(int baseLength){

for(int i = 1; i <= int baselength; i++){
for (int j = 1; j <= 1; j++){
System.out.print("*");
}
System.out.println();
}
}

private static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
while (true) {

System.out.println("Enter the length of the base of the triangle (1-10): ");
int baseLength = scanner.nextInt();
if (baseLength >= 1 && baseLength <= 10) {

break;
          
 } else {           

System.out.println("Invalid input. Please enter a number between 1 and 10.");
}
}
scanner.close();
}
}