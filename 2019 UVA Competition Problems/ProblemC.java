import java.text.DecimalFormat;
import java.util.*;

public class ProblemC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		double vi, angle, xpos, vy, vx, t, y;
		DecimalFormat df = new DecimalFormat("#.###");
		for (int i = 0; i < cases; i++) {
			vi = in.nextDouble();
			angle = in.nextDouble();
			xpos = in.nextDouble();
			vx = vi * Math.cos(angle);
			vy = vi * Math.sin(angle);
			t = xpos / vx;
			y = Math.floor(((vy * t) - (0.5 * 9.8 * Math.pow(t, 2))) * 1000);
			System.out.println(df.format((y / 1000)));
		}
	}

}
