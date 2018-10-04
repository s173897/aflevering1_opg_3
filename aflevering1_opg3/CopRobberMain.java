package aflevering1_opg3;

public class CopRobberMain {

	public static void main (String[] args)
	{
		System.out.println("Welcome to Cop Robber");
		//System.out.println("Please input the size of the gameboard. Do not input zero or letters.");

		int inputN = gameMenu.getgameBoardSize();
//		System.out.println("You put in " + inputN+". The game board will be "+inputN+" times "+inputN+" in size.");
//		System.out.println("Please input the amount of random variation.");
		int inputS = gameMenu.getRandomVariation();
//		System.out.println("You put in " + inputS+".");
//		System.out.println("Please input the number of turns you would like to run the simulation for");
		int inputT = gameMenu.getTurns();
//		System.out.println("You put in " + inputT+". The simulation will now run for "+inputT+" turns.");

//		console.close();
			
		
		
		CopRobber.runSimulation(inputN, inputS, inputT);
	
//	
	}
}
