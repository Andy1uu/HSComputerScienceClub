import java.util.*;

public class ProblemE {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		String race, raceName, first, second, third, carName;
		int numCars, prestige, numRaces;
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		ArrayList<String> keys = new ArrayList<String>();
		for (int a = 0; a < cases; a++) {
			race = scan.next();
			numCars = scan.nextInt();
			for (int b = 0; b < numCars; b++) {
				carName = scan.next();
				hs.put(carName, 0);
			}
			numRaces = scan.nextInt();
			for (int b = 0; b < numRaces; b++) {
				raceName = scan.next();
				prestige = scan.nextInt();
				first = scan.next();
				second = scan.next();
				third = scan.next();
				for (Map.Entry<String, Integer> name : hs.entrySet()) {
					if (name.getKey().equals(first)) {
						hs.put(name.getKey(), name.getValue() + prestige);
					} else if (name.getKey().equals(second)) {
						hs.put(name.getKey(), name.getValue() + (prestige / 2));
					} else if (name.getKey().equals(third)) {
						hs.put(name.getKey(), name.getValue() + (prestige / 4));
					}
				}
			}
			keys = new ArrayList<String>(hs.keySet());
			Collections.sort(keys);
			System.out.println(race + ":");
			for (String k : keys) {
				System.out.print(k);
				System.out.println(" " + hs.get(k));
			}
			hs = new HashMap<String, Integer>();
		}
	}
}
