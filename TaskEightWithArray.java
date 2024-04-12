import java.util.*;

public class TaskEightWithArray {
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();

    System.out.println("enter number between 1 - 100 ");
    int positiveCount = 0;
    int negativeCount = 0;

   while(true){
      

      System.out.print("enter score: ");
      int number = scanner.nextInt();
      scores.add(number);

      if (number > 100) {
        negativeCount++;
      } else if (number <= 100) {
        positiveCount++;
      }
      

      if (scores.size() == 10) {
        break;
      }
    } 

    System.out.println("sum of valid numbers is " + positiveCount);
    System.out.println("count of numbers greater than 100 is " + negativeCount);
    System.out.println("the scores are " + scores);
  }
}
