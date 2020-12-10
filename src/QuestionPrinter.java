import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is our controller.
 * It takes the data from our Model (Question) and writes it to our view (JSON file
 * on the hard drive)
 * @author Marco Pettinato
 *
 */
public class QuestionPrinter 
{	
	/**
	 * This prints out our header for the program
	 */
	public static void printHeader()
	{
		System.out.println("*		" + "What could possibly be more fun than this?" + "		*");
		System.out.println("*************************************************************************");
		System.out.println("*		" + "OOP Theory and Concept Questions" + "		        *");
		System.out.println("*************************************************************************");
		System.out.println("*		" + "Nothing. Nothing at all. Nope. Nada. Nunce." + "	        *");
		System.out.println("Enter name of file containing questions:");
	}
	
	/**
	 * @param Takes a scanner object as a parameter to find the user input
	 * Presents a menu to the user for what they would like to do
	 * @return returns the users decision represented by an int
	 */
	public static int showMenuAndGetChoice(Scanner sc) 
	{
		System.out.println("Here are your choices: ");
		System.out.println("1. Take a quiz");
		System.out.println("2. See Questions and answers");
		System.out.println("3. Exit.");
		System.out.print("Enter the number of your choice: ");
		int result = sc.nextInt();
		sc.nextLine(); // clear the end-of-line marker
		return result;
	}
	
	/**
	 * This prints out an exit message for when the user decides to exit the program
	 */
	public static void allDone() 
	{
		System.out.println("*********************************************************************");
		System.out.println("*		" + "Thank you for taking CPSC 24500 "	+ "		    *");
		System.out.println("*********************************************************************");
	}
	
	/**
	 * @param takes in an array list of question 
	 * Prints out the entire array list of questions with the answer coming before the question
	 */
	public static void printQuestions(ArrayList<Question> Questions) 
	{
		for (Question Question : Questions) 
		{
			System.out.println(Question.getAnswer() + " " + Question.getText());
			System.out.println();
		}
	}
}