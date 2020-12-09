import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quizzer 
{
	public static ArrayList<Question> randomQuestion(ArrayList<Question> q,int num)
	{
		ArrayList<Question> random = null;
		int total = q.size();
		Random rand = new Random();
		for(int i = 0; i < num; i++)
		{
			random.set(i, q.get(rand.nextInt(total)));
		}
		return random;
	}
}