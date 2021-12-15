import java.util.*;
public class ProblemB 
{
	private static Scanner scan;

	public static void main(String[] args) 
	{
	scan = new Scanner(System.in);
    int cases  = scan.nextInt();
    int banana = 0, mushroom = 0, bitcoins = 0, rupees = 0;
    for(int a = 0; a<cases;a++)
    {
    	banana = scan.nextInt();
    	mushroom = scan.nextInt();
    	rupees = scan.nextInt();
    	bitcoins = (banana*13)+(mushroom*5)+(rupees*462);
    	System.out.println(bitcoins);
    }
	}
}
