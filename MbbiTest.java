import java.util.*;
	public class MbbiTest{
	public static void main(String... arg){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		List<Object> questions = new ArrayList<>();

int countA = 0;
int countB = 0;

System.out.println("Pls enter your name");
String name = scanner.nextLine();

	questions.add(0, " expend energy, enjoy groups (A) or conserve energy, enjoy one-on-one (B)");
	questions.add(1, " Interpret literally (A) or look for meaning and possibilities (B)");
	questions.add(2, "logical, thinking, questioning (A) or empathetic, deeling, accomodating(B)");
	questions.add(3, "organized, orderly (A) or flexiblle, adaptable(B)");
	questions.add(4, "more outgoing, think out loud (A) or more reserved, think to yourself(B)");
	questions.add(5, "practical, realistic, experiental (A) or imaginative, innovative, theoritical(B)");
	questions.add(6, "candid, straight forward, frank (A) or tactful, kind, encouraging(B)");
	questions.add(7, "plan, schedule (A) or unplanned, spontaneous (B)");
	questions.add(8, "seek many task, public activities, interaction with others (A) or seek private, solitary activities with quiet to concentrate(B)");
	questions.add(9, "standard, usual, conventional (A) or different, novel, unique (B)");
	questions.add(10, "firm, tend to criticize, hold the line (A) or gentle, tend to appereciate, concilate(B)");
	questions.add(11, "regulated, structured (A) or easy-going, live and let live(B)");
	questions.add(12, "external, communicative, express yourself (A) or internal,  reticent, keep to yourself (B)");
	questions.add(13, "focus on here-and-now (A) or look to the future, global perspective, big picture(B)");
	questions.add(14, "tough minded, just (A) or tender hearted, merciful (B)");
	questions.add(15, "preparation, plan ahead (A) or go with the flow, adapt as u go (B)");
	questions.add(16, "active, initiate (A) or reflective, deliberate (B)");
	questions.add(17, "facts, things, what is (A) or ideas, dreams what could be, philosophical(B)");
	questions.add(18, "matter of fact, issue-oriented (A) or sensitive, people-oriented, compassionate(B)");
	questions.add(19, "control, govern (A) or latitude, freedom (B)");

		
		
		for( int i = 0; i < 20; i++ ){
		List <Integer> askedQuestions = new ArrayList<>();

			int q;
			do{
				q = random.nextInt(questions.size());
			}while (askedQuestions.contains(q));
			askedQuestions.add(q);
		
	System.out.println(questions.get(q));
	System.out.println(" Enter your choice  (A/B): ");
	String choice = scanner.nextLine();	
		if (choice.equalsIgnoreCase("A")){
		countA++;
		} else if (choice.equalsIgnoreCase("B")){
		countB++;
		} else {   
			System.out.println("invalid choice please enter 'A' or 'B' " );
			i--;
			continue;

		
		}
		if ((i + 1) % 5 == 0){
		System.out.println("Number of A selected : " + countA );
		System.out.println("Number of B selected : " + countB );
		}
}

String prompt = """

INFP
Healer
The Thoughtful Idealist (MBTI)
The Mediator (16Personalities)
The INFP Personality Type
INFPs are imaginative idealists, guided by their own core values and beliefs.
To a Healer, possibilities are paramount; 
the realism of the moment is only of passing concern. 
They see potential for a better future, 
and pursue truth and meaning with their own individual flair.

INFPs are sensitive, caring, and compassionate, and are deeply concerned with
the personal growth of themselves and others. Individualistic and
nonjudgmental, INFPs believe that each person must find their own path.
They enjoy spending time exploring their own ideas and values, and are gently
encouraging to others to do the same. INFPs are creative and often artistic;
they enjoy finding new outlets for self-expression.

What does INFP stand for?
INFP is one of the sixteen personality types created by Katharine Briggs and
Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTIO).
INFP stands for Introversion, iNtuition, Feeling, and Perceiving, 
which are four core personality traits based on the work of psychologist C.G. Jung.
Each of the four letters of the INFP code signifies a key personality trait of this type.
INFPs are energized by time alone (Introverted), focus on ideas and concepts rather than
facts and details (iNtuitive), make decisions based on feelings and values (Feeling),
and prefer to be spontaneous and flexible rather than planned and organized (Perceiving).

""";

System.out.println(prompt);


	}
	}