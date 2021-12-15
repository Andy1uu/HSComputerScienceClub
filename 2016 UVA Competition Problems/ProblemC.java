import java.util.*;
public class ProblemC 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		int result = 0, num;
		for(int a = 0; a < cases; a++)
		{
			num = scan.nextInt();
			System.out.print("Case "+(a+1)+": ");
			result = (int)(Math.pow(2, num) - 1);
			System.out.println(result);
		}
	}

}
