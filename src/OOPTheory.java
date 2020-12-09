import java.util.ArrayList;
import java.util.Scanner;
public class OOPTheory 
{	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int choice;
		QuestionPrinter.printHeader();
		System.out.println("Enter name of file containing questions:");
		String fname = scan.nextLine();
	
		choice = QuestionPrinter.showMenuAndGetChoice(scan);
		{
			/* 
		 	* this will present a menu of options to the user.
		 	* the user will be able to create Questions, print them,
		 	* delete them, and save to a json file.
		 	*/
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
				QuestionPrinter.printQuestions(Questions);
			}	 
			else if (choice == 3) 
			{
				System.out.println("*********************************************************************");
				System.out.println("*		" + "Thank you for taking CPSC 24500+ "	+ "		    *");
				System.out.println("*********************************************************************");
			}
			else
			{
				System.out.println("Invald input.");
			}
		}
	}
}
