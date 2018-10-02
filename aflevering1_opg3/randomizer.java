package aflevering1_opg3;

import java.util.*;

public class randomizer {
	public static void main(String[] args) {
		Random ran = new Random();
		int s = ran.nextInt(100 + 1 + 100) - 100;
		System.out.println(s);

	}
}
