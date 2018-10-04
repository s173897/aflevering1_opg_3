package aflevering1_opg3;

import java.util.Scanner;

public class gameMenu {
	static Scanner console = new Scanner(System.in);

	public static void Gamemenu() {

//		System.out.println("Welcome to Cop Robber");
//		System.out.println("Please input the size of the gameboard. Do not input zero or letters.");
//
//		int inputN = getNumberOverZero();
//		System.out.println("You put in " + inputN+". The game board will be "+inputN+" times "+inputN+" in size.");
//		System.out.println("Please input the amount of random variation.");
//		int inputS = getNumberOverZero();
//		System.out.println("You put in " + inputS+".");
//		System.out.println("Please input the number of turns you would like to run the simulation for");
//		int inputT = getNumberOverZero();
//		System.out.println("You put in " + inputT+". The simulation will now run for "+inputT+" turns.");
//
//		console.close();
		
	}

	private static int getNumberOverZero() {
		while (console.hasNext()) {

			while (!console.hasNextInt()) {
				System.out.println("That's not a number");
				console.next();
			}
			while (console.hasNextInt()) {
				int x = console.nextInt();
				if (x > 0) {
					return x;
				} else {
					System.out.println("It needs to be larger than zero.");
					
				}
			}

			
		}

		return console.nextInt();
	}

	public static int getgameBoardSize() {
		System.out.println("Please input the size of the gameboard. Do not input zero or letters.");
		int x =  getNumberOverZero();
		System.out.println("You put in " + x +". The game board will be "+x+" times "+x+" in size.");
		return x;
	}

	public static int getRandomVariation() {
		System.out.println("Please input the amount of random variation.");
		int inputS = getNumberOverZero();
		System.out.println("You put in " + inputS+".");
		return inputS;
	}

	public static int getTurns() {
		System.out.println("Please input the number of turns you would like to run the simulation for");
		int inputT = getNumberOverZero();
		System.out.println("You put in " + inputT+". The simulation will now run for "+inputT+" turns.");
		return inputT;
	}
}
