import java.util.*;
public class ProblemA 
{
	private static Scanner scan;

	public static void main(String[] args) 
	{
	scan = new Scanner(System.in);
	int cases = scan.nextInt();
	String input;
	for(int a =0; a<cases;a++)
	{
		input = scan.next();
		if(input.equals("Mario"))
		{
			System.out.println("Polo");
		}
		else
		{
			System.out.println("Silence");
		}
	}
	}
}
