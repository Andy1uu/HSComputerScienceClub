import java.util.*;
public class ProblemH 
{
	public static String findCommonPrefix(ArrayList<String> n, int length)
	{
		String commonPrefix = "No Common Prefix";

	      for(int charIndex = 0; charIndex< length; charIndex++) {
	         char currentLetter = n.get(0).charAt(charIndex);
	         for(int i = 0; i<n.size(); i++) {
	            if(n.get(i).charAt(charIndex) != currentLetter) 
	               return commonPrefix;
	         }
	         commonPrefix = n.get(0).substring(0, charIndex+1);
	      }

	      return commonPrefix;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt(), numNames, minLen;
		String name;
		ArrayList<String> names = new ArrayList<String>(); 
		for(int a = 0; a<cases;a++)
		{
			numNames = scan.nextInt();
			name = scan.next();
			names.add(name);
			minLen = name.length();
			for(int b = 1; b<numNames;b++)
			{
				name = scan.next();
				names.add(name);
				minLen = Math.min(minLen, name.length());
			}
			System.out.println(findCommonPrefix(names, minLen));
		}
	}
}
