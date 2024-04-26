import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Value Of Age");
        int age = scanner.nextInt();

        String result = (age >= 65) ? "Age is greater than or equal to 65" : "Age is less than 65";
        System.out.println(result);
    }
}
