import java.util.ArrayList;

public class Question
{
	//Instance Variables
	private String text;
	private String answer;
	private String a;
	private String b;
	private String c;
	private String d;
	
	/**
	 * @return returns the text representing the question
	 */
	public String getText() 
	{
		return text;
	}
	
	/**
	 * @param String text takes input of the current question
	 * sets the text representing the question
	 */
	public void setText(String text) 
	{
		this.text = text;
	}
	
	/**
	 * @return returns the answer choice representing a
	 */
	public String getA() 
	{
		return a;
	}
	
	/**
	 * @return returns the answer choice representing b
	 */
	public String getB() 
	{
		return b;
	}
	
	/**
	 * @return returns the answer choice representing c
	 */
	public String getC() 
	{
		return c;
	}
	
	/**
	 * @return returns the answer choice representing d
	 */
	public String getD() 
	{
		return d;
	}
	
	/**
	 * @param String a takes input for current answer choice for a
	 * @param String a takes input for current answer choice for b
	 * @param String a takes input for current answer choice for c
	 * @param String a takes input for current answer choice for d
	 * method sets the answer choices for everything using the this command
	 */
	public void setChoices(String a,String b, String c, String d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	/**
	 * @return returns the current answer for the question
	 */
	public String getAnswer() 
	{
		return answer;
	}
	
	/**
	 * @param String answer take the current answer to the question
	 * sets the answer using the this command
	 */
	public void setAnswer(String answer) 
	{
		this.answer = answer;
	}
	
	/**
	 * Allows for creation of default tile setting color to red and shape to circle
	 */
	public Question() 
	{
		text = "none";
		a = "none";
		b = "none";
		c = "none";
		d = "none";
		answer = "nothing to see here";
	}
	
	/**
	 * @param String text allows for initialization with set text
	 * @param String text allows for initialization with set answer for a
	 * @param String text allows for initialization with set answer for b
	 * @param String text allows for initialization with set answer for c
	 * @param String text allows for initialization with set answer for d
	 * @param String text allows for initialization with set answer for answer
	 * Method allows for the creation of question with specialized question contents 
	 */
	public Question(String text, String a, String b, String c, String d, String answer) 
	{
		setText(text);
		setChoices(a,b,c,d);
		setAnswer(answer);
	}
	
	@Override
	/**
	 * @return this function returns a formatted string with the the question, choices, and answer
	 */
	public String toString() 
	{
		return String.format("%s\n%s\n%s\n%s\n%s\n%s",text,a,b,c,d,answer);
	}
}