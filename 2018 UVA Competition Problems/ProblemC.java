import java.util.*;
public class ProblemC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt(), num;
		String toy, story;
		for (int a = 0; a < cases; a++) {
			toy = scan.next();
			story = scan.next();
			num = scan.nextInt() + 1;
			System.out.println(toy + " " + story + " " + num);
		}
	}

}
