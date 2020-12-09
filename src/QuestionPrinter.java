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
 * @author klumpra
 *
 */
public class QuestionPrinter 
{
	public static void printHeader()
	{
		System.out.println("*		" + "What could possibly be more fun than this?" + "		*");
		System.out.println("*************************************************************************");
		System.out.println("*		" + "OOP Theory and Concept Questions" + "		        *");
		System.out.println("*************************************************************************");
		System.out.println("*		" + "Nothing. Nothing at all. Nope. Nada. Nunce." + "	        *");
	}
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
	
	public static void printQuestions(ArrayList<Question> Questions) 
	{
		for (Question Question : Questions) 
		{
			System.out.println(Question);
			System.out.println();
		}
	}
}