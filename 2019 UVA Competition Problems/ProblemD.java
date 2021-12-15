import java.util.*;

public class ProblemD {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt(), nGods, nQueries;
		String gName, gSkill, nameAskedFor;
		HashMap<String, String> hm = new HashMap<String, String>();
		for (int c = 0; c < cases; c++) {
			nGods = in.nextInt();
			nQueries = in.nextInt();
			for (int i = 0; i < nGods; i++) {
				gName = in.next();
				gSkill = in.next();
				hm.put(gName, gSkill);
			}
			for (int n = 0; n < nQueries; n++) {
				nameAskedFor = in.next();
				System.out.println(hm.get(nameAskedFor));
			}

		}
	}
}