import java.util.*;

public class ProblemB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int i = 0; i < cases; i++) {
			int shift = in.nextInt();
			if (shift > 26) {
				shift %= 26;
			}
			in.nextLine();
			String sentence = in.nextLine();
			String newSentence = "";
			for (int j = 0; j < sentence.length(); j++) {
				if (sentence.charAt(j) == ' ') {
					newSentence += " ";
				} else {
					char c = (char) (sentence.charAt(j) + shift);
					if (c > 'z') {
						newSentence += (char) (sentence.charAt(j) - (26 - shift));
					} else {
						newSentence += c;
					}
				}
			}
			System.out.println(newSentence);
			newSentence = "";
		}
	}
}
