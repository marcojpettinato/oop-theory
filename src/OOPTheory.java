import java.util.ArrayList;
import java.util.Scanner;
public class OOPTheory 
{	public static void main(String[] args)
	{
		//Variables
		Scanner scan = new Scanner(System.in);
		int choice;
		boolean quiz = true;
		//Call functions
		QuestionPrinter.printHeader();
		String fname = scan.nextLine();
	
		while(quiz)
		{
			//Assignment of choice
			choice = QuestionPrinter.showMenuAndGetChoice(scan);
			if (choice == 1) 
			{ 
				System.out.println("How many questions would you like?");
				int qNum = scan.nextInt();
				ArrayList<Question> Questions = QuestionReader.readFromJSON(fname);
				Quizzer.randomQuestion(Questions, qNum);
			}
			else if (choice == 2) 
			{
				ArrayList<Question>Questions = QuestionReader.readFromJSON(fname);
				System.out.println("Here are the answers:");
				QuestionPrinter.printQuestions(Questions);
			}	 
			else if (choice == 3) 
			{
				QuestionPrinter.allDone();
				quiz = false;
			}
			else if(choice != 1 || choice != 2 || choice != 3)
			{
				System.out.println("Invald input. Please input a number, 1,2, or 3.");
			}
		}
	}
}
