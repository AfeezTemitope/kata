import java.util.*;

public class TaskTwoArray{
  public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	 List<Integer> scores = new ArrayList<>();

	System.out.println("****************");
	System.out.println("enter 10 scores ");
	System.out.println("****************");
	
	int numberOfScore = 10;
	for (int i = 0; i < 10; i++){
	 
	  System.out.print("enter score " + (i + 1) + " :");
	  int number = scanner.nextInt();
	  scores.add(number);
	}
	int totalScore = 0;
	for (int score : scores){
	  totalScore += score;
	}
	int average = totalScore / numberOfScore;
	System.out.println("****************");
	System.out.println("the scores re: "+ scores + " \nand it has an average of " + average + " while " + " \nthe total score is " + totalScore);

}
 } 