import java.util.*;

public class ProblemH {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in), s;
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		String key[];
		int cases = scan.nextInt();
		HashMap<String, String> hm = new HashMap<String, String>();
		String[] sentence;
		String word = "";
		scan.nextLine();
		for (int i = 0; i < cases; i++) {
			key = scan.nextLine().split("");
			for (int j = 0; j < key.length; j++) {
				hm.put(key[j], alphabet[j]);
			}
			sentence = scan.nextLine().split(" ");
			for (int b = 0; b < sentence.length; b++) {
				for (int c = 0; c < sentence[b].length(); c++) {
					word += hm.get(Character.toString(sentence[b].charAt(c)));

				}
				word += " ";
			}
			System.out.println(word);
			hm = new HashMap<String, String>();
			word = "";
		}
	}
}
