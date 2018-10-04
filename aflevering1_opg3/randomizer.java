package aflevering1_opg3;

import java.util.Random;

public class randomizer {
	public static int random(int max) {
		Random ran = new Random();
//		int min = 0;
		int s;
		do {
			s = ran.nextInt(2*max + 1) - max;
		} while (s == 0);

		return s;

	}

}
