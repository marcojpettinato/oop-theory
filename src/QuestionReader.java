import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class QuestionReader 
{
	public static ArrayList<Question> readFromJSON(String fname) 
	{
		try 
		{
			ArrayList<Question> questions = new ArrayList<Question>();
			FileReader reader = new FileReader(new File(fname));
			JSONParser parser = new JSONParser();
			JSONObject all = (JSONObject)parser.parse(reader);
			JSONArray arr = (JSONArray)all.get("question");
			Iterator itr = arr.iterator();  // help me step through every entry
			JSONObject questionObject;
			String text, choices, answer;
			while (itr.hasNext()) 
			{
				questionObject = (JSONObject)itr.next();
				text = questionObject.get("question").toString();
				choices = questionObject.get("choices").toString();
				answer = questionObject.get("answer").toString();
				questions.add(new Question(text,choices,answer));
			}
			reader.close();
			return questions;
		} 
		catch (Exception ex) 
		{
			return null;
		}
	}
}