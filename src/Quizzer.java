import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Quizzer 
{
	//Instance Variable
	private static Scanner scan = new Scanner(System.in);
	
	/**
	 * @param Takes in an array List of questions called q that is all the questions from the json file
	 * @param Takes in an integer called num to represent how many questions the quiz will be
	 * This program creates an array with the number of questions and randomly orders them so no question will be repeated
	 * and the question order is random. It then presents the question with answer choices and prompts the user for an answer
	 * it then tells them if they were correct or not. It finally tells them how many questions they got right out of the total.
	 */
	public static void randomQuestion(ArrayList<Question> q,int num)
	{
		//Variables
		int total = q.size();
		int correct = 0;
		ArrayList<Question> questions = new ArrayList<Question>();
		ArrayList<Integer> QuestionsNum = new ArrayList<Integer>(total);
		
		//For loop to create the exact number of questions
		for(int i=0; i<total; i++)
		{
			QuestionsNum.add(i);
		}
		//Shuffle the question numbers so that no question can be repeated
		Collections.shuffle(QuestionsNum);
		
		//For loop to get a random question
		for(int i = 0; i <num; i++)
		{
			//Get a random Question
			Question nextQ = q.get(QuestionsNum.get(i));
			
			//Get question Data
			String question = nextQ.getText();
			String A = nextQ.getA();
			String B = nextQ.getB();
			String C = nextQ.getC();
			String D = nextQ.getD();
			String Answer = nextQ.getAnswer();
			
			//Print the questions
			System.out.println(question);
			System.out.println("a.)" + A);
			System.out.println("b.)" + B);
			System.out.println("c.)" + C);
			System.out.println("d.)" + D);
			
			System.out.println("Type the letter of your choice");
			String guess = scan.nextLine();
			
			if(guess.equalsIgnoreCase(Answer))
			{
				System.out.println("Correct!");
				correct++;
			}
			
			else
			{
				System.out.println("Sorry. The correct answer is " + Answer + ".");
			}
		}
		System.out.println("You answered " + correct + " correct out of " + num + " questions asked.");
	}
}