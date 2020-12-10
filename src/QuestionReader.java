import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class QuestionReader 
{
	/**
	 * @param String fname represents the name of the json file
	 * the function uses json imports to work through the json file in order to break the questions apart
	 * and create question objects and add them to an arraylist of question objects to be used later. 
	 * @return returns the arraylist of all the questions from the json file
	 */
	public static ArrayList<Question> readFromJSON(String fname) 
	{
		try 
		{
			ArrayList<Question> questions = new ArrayList<Question>();
			FileReader reader = new FileReader(new File(fname));
			JSONParser parser = new JSONParser();
			JSONObject all = (JSONObject)parser.parse(reader);
			JSONArray arr = (JSONArray)all.get("questions");
			Iterator itr = arr.iterator();  // help me step through every entry
			JSONObject questionObject;
			String text, answer;
			String a,b,c,d;
			while (itr.hasNext()) 
			{
				questionObject = (JSONObject)itr.next();
				text = questionObject.get("question").toString();
				a = questionObject.get("a").toString();
				b = questionObject.get("b").toString();
				c = questionObject.get("c").toString();
				d = questionObject.get("d").toString();
				answer = questionObject.get("answer").toString();
				questions.add(new Question(text,a,b,c,d,answer));
			}
			reader.close();
			return questions;
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
			return null;
		}
	}
}