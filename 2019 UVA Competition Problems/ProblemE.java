import java.util.*;

public class ProblemE {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] pTemps, aTemps;
		int cases = in.nextInt(), counter = 0;
		for (int i = 0; i < cases; i++) {
			pTemps = new int[10];
			aTemps = new int[10];
			for (int a = 0; a < 10; a++) {
				pTemps[a] = in.nextInt();
			}
			for (int b = 0; b < 10; b++) {
				aTemps[b] = in.nextInt();
			}
			for (int c = 0; c < 10; c++) {
				if (pTemps[c] == aTemps[c]) {
					counter++;
				}
			}
			if (counter > 7) {
				System.out.println("Oracle");
			} else if (counter < 5) {
				System.out.println("Fraud");
			} else {
				System.out.println("Draw");
			}
			counter = 0;
		}
	}
}
