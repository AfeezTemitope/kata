import java.util.Scanner;
public class Grade{
public static void main(String... args){
Scanner input = new Scanner (System.in);

System.out.println("=+++**********************+++=");
System.out.println("<---WELCOME TO STUDENT GRADE--->");
System.out.println("=+++**********************+++=");

System.out.print(" 1. Calculate student grade\n 2.Exit\n");
System.out.print("Enter an option: ");
int option = input.nextInt();


switch(option){
// GRADE TO CALCULATE
case 1-> {
System.out.println("<-----HOW MANY GRADE WOULD YOU LIKE TO CALCULATE----->");
int grade = input.nextInt();

int i = 1; 
while( i <= grade){


         System.out.println("ENTER STUDENT NAME\n");
         String studentName = input.next();
          
         System.out.print("ENTER SCORE 1\n");
         int firstScore = input.nextInt();
         
         System.out.print("ENTER SCORE 2\n");
         int secondScore = input.nextInt();
          
         System.out.print("ENTER SCORE 3\n");
         int thirdScore = input.nextInt();
        


int sum = firstScore + secondScore + thirdScore ;
if (sum <= 50){
System.out.printf(studentName + " bloody failure you got D and yor score is: %d%n ", sum);
} else if ( sum <= 70){
System.out.printf(studentName +  " you passed and your grade is C  with a sum of : %d%n ", sum);
} else if (sum <= 80){
System.out.printf(studentName + " you passed and your grade is B  with a sum of  : %d%n ", sum);
} else if (sum <= 100){
System.out.printf(studentName + " you passed and your grade is A  with a sum of : %d%n ", sum);
} else if (sum > 100 ){
System.out.printf(" invalid score cannot calculate");

}
i++;
}
}
}
}
}


