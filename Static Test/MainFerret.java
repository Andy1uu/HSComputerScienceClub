import java.util.*;
public class MainFerret
{
	private static class Ferret implements Comparable<Ferret>
	{
		private String name; 
		private int age;
		private double weight;
		private int wTL;
		public Ferret(String n, int a, double w,int wtl)
		{
			name = n;
			age = a;
			weight = w;
			wTL = wtl;
		}
		public int compareTo(Ferret other)
		{
			if(this.age > other.age)
			{
				return 1;
			}
			else if(this.age < other.age)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
		public String toString()
		{
			return name+", "+age+", "+weight+", "+wTL+"\n";
		}
	}
	
	public static void main(String[] args)
	{
		ArrayList<Ferret> ferrets = new ArrayList<Ferret>();
		for(int i = 0; i<5; i++)
		{
			ferrets.add(new Ferret("bob", (int)(Math.random() * 17 + 1),50.0, 3));
		}
		Collections.sort(ferrets);
		System.out.println(ferrets);
	}
}
