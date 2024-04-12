import java.util.*;

public class TaskFourWithArray{
  public static void main(String... args){
	Scanner scanner = new Scanner(System.in);
	    List<Integer> scores = new ArrayList<>();

	System.out.println("****************");
	System.out.println("enter 10 scores ");
	System.out.println("****************");
	int totalScore = 0;
	int even = 0;
	int numberOfScore = 10;
	for (int i = 0; i < 10; i++){
	 
	  System.out.print("enter score " + (i + 1) + " :");
	  int number = scanner.nextInt();
	  scores.add(number);
	}
	for(int score : scores){
	  totalScore += score;
	if ( score % 2 == 0){
	even++;
	
	}
        }
       

	System.out.println("****************");
	System.out.println("values of all scores inputed --> " + scores);
	System.out.println("count of  even numbers re " + even );
	System.out.print("the total score is " + totalScore);

}
 } 