package aflevering1_opg3;

import java.util.Random;

public class CopRobber {
	public static void main(String[] args) {
		int min = -10;
		int max = 10;
		int s = randInt(min,max);
		System.out.println(s);

	}

	public static void runSimulation(int n, int s, int t) {

	}
	
	
	
	
	
	
	public static int randInt(int min, int max)
	{
		 Random rand = null;
		 int randomNum = rand.nextInt((max - min) + 1) + min;

		    return randomNum;
	}
}


