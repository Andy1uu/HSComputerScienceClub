import java.util.*;
public class ProblemA 
{
   public static void main(String[] args) 
   {
	   Scanner scan = new Scanner(System.in);
	   int cases = scan.nextInt(), m, n, p;
	   double total;
	   ArrayList<Double> mlist = new ArrayList<Double>();
	   ArrayList<Double> jlist = new ArrayList<Double>();
	   for(int  a = 0; a<cases; a++)
	   {
		  m = scan.nextInt();
		  n = scan.nextInt();
		  p = scan.nextInt();
		  for(int a1 =0; a1<m;a1++)
		  {
			  mlist.add(scan.nextDouble()/100);
		  }
	   }
   }
}

