import java.util.*;
public class ProblemK {

	public static void main(String[] args) 
	{
	//Pokeballs
	Scanner scan  = new Scanner(System.in);
	int cases = scan.nextInt();
	int numBalls;
	for(int a = 0; a<cases;a++)
	{
		numBalls = scan.nextInt();
		if((numBalls%7 == 1 || numBalls %7 == 0))
		{
			System.out.println("Second");
		}
		else
		{
			System.out.println("First");
		}
	}
	}

}
