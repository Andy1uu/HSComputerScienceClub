import java.util.*;

public class ProblemA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt(), numWords;
		String[] words;
		for (int i = 0; i < cases; i++) {
			numWords = scan.nextInt();
			words = new String[numWords];
			for (int a = 0; a < numWords; a++) {
				words[a] = scan.next();
			}
			for (int l = 0; l < words.length; l++) {
				if (words[l].equals("bing")) {
					words[l] = "bong";
				} else if (words[l].equals("Bing")) {
					words[l] = "Bong";
				} else if (words[l].equals("BING")) {
					words[l] = "BONG";
				}
			}
			System.out.print(words[0]);
			for (int j = 1; j < words.length; j++) {
				System.out.print(" " + words[j]);
			}
			System.out.println();
		}
	}
}
