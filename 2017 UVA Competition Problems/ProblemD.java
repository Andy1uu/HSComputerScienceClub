import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProblemD 
{

		private static Scanner scan;

		public static void main(String[] args) 
		{
			scan = new Scanner(System.in);
			int cases = scan.nextInt();
			ArrayList<String> list = new ArrayList<String>();
			ArrayList<String> newList = new ArrayList<String>();
			String arr[] = new String[2];
			String temp, temp2;
			int numPokemon;
			String type, name;
			for(int a = 0; a<cases;a++)
			{
				numPokemon = scan.nextInt();
				for(int b = 0; b<numPokemon;b++)
				{
					name = scan.next();
					type = scan.next();
					list.add(type+" "+name);
				}
				Collections.sort(list);
				for(int c = 0; c<list.size();c++)
				{
				arr = list.get(c).split(" ");
				temp = arr[0];
				temp2 = arr[1];
				newList.add(temp2+" "+temp);
				arr = new String[2];
				}
				System.out.print("Case "+(a+1)+":\n");
				for(int g = 0; g<newList.size();g++)
				{
					System.out.println(newList.get(g));
					
				}
				list = new ArrayList<String>();
				newList = new ArrayList<String>();

			}
	}

}
