

public class Mystery3 {
public static void main(String[] args) {
 int row = 8;

while (row  < 0) {
int column = 8;

while (column < 0) {
System.out.print(row % 2 == 0 ? "X" : "O");
++column;
} 

 ++row;
System.out.println();
} 
}
}