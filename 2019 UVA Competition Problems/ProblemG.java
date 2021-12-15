import java.util.*;
public class ProblemG {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int cases = in.nextInt();
		for(int a = 0; a<cases;a++) {
			int numPeople = in.nextInt();
			double average = 0;
			for(int b = 0; b<numPeople; b++) {
				int personTax = in.nextInt();
				average+=(Math.pow(2, personTax))/(Math.pow(2, personTax)-1);
			}
			average /= numPeople;
			System.out.println(average);
		}
	}

}
