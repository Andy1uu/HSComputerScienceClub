
public class MainCow 
{
private static class Cow implements Comparable<Cow>
{
	private String name;
	private int age;
	private  double weight;
	
	public Cow(String name,int age,double weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public int compareTo(Cow other)
	{
		if(this.weight>other.weight)
		{
			return 1;
		}
		else if(this.weight<other.weight)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
public static void main(String[] args)
{
	
}
}
