import java.util.ArrayList;

public class Question
{
	private String text;
	private String choices;
	private String answer;
	
	public String getText() 
	{
		return text;
	}
	
	public void setText(String text) 
	{
		this.text = text;
	}
	
	public String getChoices() 
	{
		return choices;
	}
	
	public void setChoices(String choices)
	{
		this.choices = choices;
	}
	
	public String getAnswer() 
	{
		return answer;
	}
	
	public void setAnswer(String answer) 
	{
		this.answer = answer;
	}
	
	public Question() 
	{
		text = "none";
		choices = "none";
		answer = "nothing to see here";
	}
	
	public Question(String text, String choices, String answer) 
	{
		setText(text);
		setChoices(choices);
		setAnswer(answer);
	}
	
	@Override
	public String toString() 
	{
		return String.format("%s\n%s\n%s",text,choices,text);
	}
}