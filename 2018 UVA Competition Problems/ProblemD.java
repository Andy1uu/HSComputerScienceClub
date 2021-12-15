import java.util.*;

public class ProblemD {
	public static class Door implements Comparable<Door> {

		String name1;
		int diff;

		public Door(String name, int difficulty) {
			name1 = name;
			diff = difficulty;
		}

		public int compareTo(Door other) {
			if (this.diff > other.diff) {
				return 1;
			} else if (this.diff < other.diff) {
				return -1;
			} else {
				return 0;
			}
		}

		public String toString() {
			return name1;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt(), difficulty, numDoors;
		ArrayList<Door> list = new ArrayList<Door>();
		String name;
		for (int a = 0; a < cases; a++) {
			numDoors = scan.nextInt();
			for (int b = 0; b < numDoors; b++) {
				difficulty = scan.nextInt();
				name = scan.next();
				Door doors = new Door(name, difficulty);
				list.add(doors);
			}
			Collections.sort(list);
			System.out.println("Case " + (a + 1) + ":");
			for (int index = 0; index < list.size(); index++) {
				System.out.println(list.get(index));
			}
			list = new ArrayList<Door>();
		}
	}

}