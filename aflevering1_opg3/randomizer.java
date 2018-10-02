package aflevering1_opg3;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class randomizer {
	public static void main(String[] args) {
		Random ran = new Random();
		int max=100;
		int min =-100;
		int s = ran.nextInt(max + 1 + min) - min;
		System.out.println(s);

	}
}
