import java.io.*;
import java.util.*;

public class Problem1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("Prob01.in.txt"));
		int cases = in.nextInt();
		for (int i = 0; i < cases; i++) {
			int grade = in.nextInt();
			if (grade >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");

			}
		}
	}
}
