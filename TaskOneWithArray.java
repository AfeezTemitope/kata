import java.util.*;

public class TaskOneWithArray {
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();

    System.out.println("****************");
    System.out.println("enter 10 scores ");
    System.out.println("****************");

    for (int i = 0; i < 10; i++) {
      System.out.print("enter score " + (i + 1) + " :");
      int number = scanner.nextInt();
      scores.add(number);
    }

    int totalScore = 0;
    for (int score : scores) {
      totalScore += score;
    }

    System.out.println("****************");
    System.out.println("the scores re " + scores + " and "+" the total score is " + totalScore);
  }
}
