import java.util.*;
public class ProblemB 
{
	public static void main(String[] args) 
	{
		 Scanner scan = new Scanner(System.in),s;
	      int cases = scan.nextInt(),totMulti = 0,totAdd = 0;
	      scan.nextLine();
	      String arr[];
	      String o = "omelette du fromage";
	      for(int a = 0; a<cases; a++)
	      {
	         arr = scan.nextLine().split(" \\+ ");
	         //System.out.println(arr[0]);
	         for(int b = 0;b<arr.length; b++)
	         {
	            s = new Scanner(arr[b]);
	            totMulti = s.nextInt();
	            while(s.hasNext())
	            {
	            s.next();
	            totMulti *= s.nextInt();
	            }
	            totAdd += totMulti;
	         }
	         System.out.print(o+":");
	         o+=" omelette du fromage";
	         for(int i = 0; i<totAdd;i++)
	         {
	         System.out.print(" omlette du fromage");
	         }
	         System.out.println();
	         totMulti = 0;
	         totAdd = 0;
	      }
	}
}
