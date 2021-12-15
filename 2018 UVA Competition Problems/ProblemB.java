import java.util.*;

public class ProblemB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt(), balloons, numPack, cost;
		for (int i = 0; i < cases; i++) {
			balloons = scan.nextInt();
			numPack = scan.nextInt();
			cost = (int) (Math.ceil(((double) balloons) / numPack));
			System.out.println(cost);
		}
	}
}
