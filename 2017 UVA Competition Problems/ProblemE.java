import java.util.HashMap;
import java.util.Scanner;

public class ProblemE {

	private static Scanner scan;

	public static void main(String[] args) 
	{
		scan = new Scanner(System.in);
		int cases = scan.nextInt();
		int numWords;
		String word;
		String key;
		int value;
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		for(int a = 0; a<cases;a++)
		{
			numWords = scan.nextInt();
			for(int b = 0; b<numWords;b++)
			{
				word = scan.next();
				hm.put(word, 1 + hm.getOrDefault(word, 0));
			}
			key = "Tie";
			value = 0;
			for(HashMap.Entry<String,Integer> hashm: hm.entrySet())
			{
				if(hashm.getValue() > value)
				{
					key = hashm.getKey();
					value = hashm.getValue();
				}
				else if(hashm.getValue() == value)
				{
					key = "Tie";
					value = hashm.getValue();
				}
			}
				System.out.println(key);
				hm = new HashMap<String,Integer>();
			}
		}

}
