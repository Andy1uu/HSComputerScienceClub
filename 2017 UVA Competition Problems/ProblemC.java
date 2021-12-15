import java.util.*;

public class ProblemC {

	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	String arr[] = new String[2];
	int cases = scan.nextInt();
	int numActions;
	String form = "Kirby";
	for(int a = 0; a < cases; a++)
	{
		numActions = scan.nextInt();
		scan.nextLine();
		for(int b = 0; b<numActions;b++)
		{
		arr = scan.nextLine().split(" ");
		if(arr[0].equals("copy"))
		{
			form = arr[1];
		}
		else
		{
			form = "Kirby";	
		}
		}
		//(arr[0].equals("copy")) ? form = arr[1]: form = "Kirby");
		System.out.println(form);
		arr = new String[2];
	}

	}

}
