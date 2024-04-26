import java.util.Scanner;
public class TabularOutput{
public static void main (String[]args){
Scanner scanner = new Scanner(System.in);

int n = 1;
System.out.println( "N\t*N\t*N\t*N\n" );
while ( n <= 5 )
System.out.printf( "%d\t%d\t%d\t%d\n",
n, ( 2 * n ), ( 3 * n ), ( 4 * n ) );
n++;

}
}




