import java.util.*;

public class ProblemG {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt(), numColonies, numTeams = 5, teamSize;
		long oldTotalAnts = 0, totalAnts = 0, antsToAdd;
		for (int i = 0; i < cases; i++) {
			numColonies = scan.nextInt();
			if (numColonies == 1) {
				System.out.println("1");
			} else {
				totalAnts = numColonies;
				teamSize = (int) (Math.floor(numColonies / 2));
				for (int a = 0; a < numColonies / 2; a++) {

					System.out.println("totAnts: " + totalAnts);
					antsToAdd = ((totalAnts-(totalAnts%10)) * numTeams * teamSize);
					System.out.println(antsToAdd);
					teamSize = (int) (Math.floor(teamSize / 2.0));
					System.out.println("TeamSIze: " + teamSize);
					totalAnts += antsToAdd;
				}
				System.out.println(totalAnts);
			}
		}
		totalAnts = 0;
	}
}
