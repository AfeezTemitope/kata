import java.util.*;

public class TwelveDaysOfChristmas {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

        System.out.println("Enter the day of Christmas you want to see (1-12):");
        int day = scanner.nextInt() - 1;
        if (day >= 0 && day < days.length) {
            System.out.println("On the " + days[day] + " day of Christmas,");
            System.out.println("My true love sent to me:");

            switch (day) {
                case 11:
                    System.out.println("Twelve drummers drumming,");
                case 10:
                    System.out.println("Eleven pipers piping,");
                case 9:
                    System.out.println("Ten lords a-leaping,");
                case 8:
                    System.out.println("Nine ladies dancing,");
                case 7:
                    System.out.println("Eight maids a-milking,");
                case 6:
                    System.out.println("Seven swans a-swimming,");
                case 5:
                    System.out.println("Six geese a-laying,");
                case 4:
                    System.out.println("Five golden rings,");
                case 3:
                    System.out.println("Four calling birds,");
                case 2:
                    System.out.println("Three French hens,");
                case 1:
                    System.out.println("Two turtle doves, and");
                case 0:
                    System.out.println("A partridge in a pear tree.");
                    break;
            }
        } else {
            System.out.println("Invalid day. Please enter a number between 1 and 12.");
        }
    }
}
