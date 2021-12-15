import java.util.Scanner;

public class ProblemE
{
//Proteins are sequences of amino acids that are represented by capital letters (each letter
//corresponds to a unique amino acid). There are many (millions) of different proteins and it is
//useful to find out how similar their sequences are. The simplest way to quantify this similarity
//between two proteins is to compute number of amino acids (letters) that are at the same
//position in both sequences and that are the same and divide this number by the length of the
//shorter protein.
	
//Input:
	
//Input consists of two protein sequence that have the same length n < 500
//First line: Sequence of the first protein
//Second line: Sequence of the second protein
	
//Output:
	
//Output should consist of 1 line that gives the value of similarity expressed as the number of the
//same amino acids / n (without spaces).
	
//Sample Input
//MGINTRELFLNFTIVLITVILMWLLVRSYQY
//MERSTQELFINFTVVLITVLLMWLLVRSYQY
	
//Sample Output
//24/31
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String first[] = scan.nextLine().split("");
		String second[] = scan.nextLine().split("");
		int length = first.length;
		int count = 0;
		for(int i = 0; i<length;i++)
		{
			if(first[i].equals(second[i]))
			{
				count++;
			}
		}
		System.out.println(count+"/"+length);
		
	}

}
