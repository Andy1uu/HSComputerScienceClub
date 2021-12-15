import java.util.*;
import java.io.*;

public class Problem2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("Prob02.in.txt"));
		int cases = in.nextInt();
		in.nextLine();
		for (int i = 0; i < cases; i++) {
			String sentence[] = in.nextLine().split("");
			int counter = 0;
			for (int j = 0; j < sentence.length; j++) {
				if (sentence[j].equals("a") || sentence[j].equals("e") || sentence[j].equals("o")
						|| sentence[j].equals("i") || sentence[j].equals("u")) {
					counter++;
				}
			}
			System.out.println(counter);
		}
	}
}
