import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Problem11 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("Prob11.in.txt"));
		int cases = in.nextInt(), Cr, Cg, Cb, T, Fr, Fg, Fb, Br, Bg, Bb, Or = 0, Og = 0, Ob = 0, distance;

		for (int i = 0; i < cases; i++) {
			// x2
			Cr = in.nextInt();
			// y2
			Cg = in.nextInt();
			// z2
			Cb = in.nextInt();
			T = in.nextInt();
			// x1
			Fr = in.nextInt();
			// y1
			Fg = in.nextInt();
			// z1
			Fb = in.nextInt();
			Br = in.nextInt();
			Bg = in.nextInt();
			Bb = in.nextInt();
			Or = Fr;
			Og = Fg;
			Ob = Fb;
			distance = (int) (Math.sqrt(Math.pow((Cr - Fr), 2) + Math.pow((Cg - Fg), 2) + Math.pow((Cb - Fb), 2)));
			if (distance <= T) {
				Or = Br;
				Og = Bg;
				Ob = Bb;

			}
			System.out.println(Or + " " + Og + " " + Ob);

		}
	}
}
