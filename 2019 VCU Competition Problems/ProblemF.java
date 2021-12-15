import java.util.*;

public class ProblemF
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double u = scan.nextDouble();
		scan.nextLine();
		String line[] = scan.nextLine().split(" ");
		ArrayList<Double> nums = new ArrayList<Double>();
		for(int i = 0; i<line.length;i++)
		{
			nums.add(Double.parseDouble(line[i]));
		}
		Collections.sort(nums);
		double a = nums.get(0);
		double au = a+u;
		int count = 0;
		ArrayList<Double> nums2 = new ArrayList<Double>();
		while(nums.get(0)>= a && nums.get(0) <= au)
		{
		for(int x = 0;x<nums.size();x++)
		{
			if(nums.get(x)>= a && nums.get(x) <= au)
			{
				nums2.add(nums.get(x));
			}
		}
		if(nums2.size()>0)
		{
			count++;
		}
		a = nums.get(0);
        au = a+u;
      nums2 = new ArrayList<Double>();
		}
		System.out.println(count);
		
		
		
		
	}

}
