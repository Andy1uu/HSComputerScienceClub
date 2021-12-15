import java.util.*;

public class ProblemF {
	public static class Racer implements Comparable<Racer> {
		private String name;
		private double time;

		public Racer(String name, double time) {
			this.name = name;
			this.time = time;
		}

		public String toString() {
			return this.name;
		}

		public int compareTo(Racer other) {
			if (this.time > other.time) {
				return 1;
			} else if (this.time < other.time) {
				return -1;
			} else {
				return 0;
			}
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		String name;
		double time;
		for (int a = 0; a < cases; a++) {
			int numRacers = in.nextInt();
			ArrayList<Racer> racers = new ArrayList<Racer>(numRacers);
			for (int b = 0; b < numRacers; b++) {
				name = in.next();
				time = in.nextDouble();
				racers.add(new Racer(name, time));
			}
			Collections.sort(racers);
			for (int c = 0; c < racers.size(); c++) {
				System.out.println(racers.get(c));
			}
		}
	}

}
