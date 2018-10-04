//import java.awt.Point;
package aflevering1_opg3;
public class CopRobber {
//	public simulation {
//		int n ;
//		int s ;
//		int t ;
////		Point robber = new Point (10, 10);
////		Point cop = new Point (5, 5);
//	//	runSimulation(n, s, t);
//	//	System.out.println(s);
//	}

	public static void runSimulation(int n, int s, int t) {
		int rx = Math.abs(randomizer.random(n));
		int ry = Math.abs(randomizer.random(n));
		int cx = Math.abs(randomizer.random(n));
		int cy = Math.abs(randomizer.random(n));
		System.out.println("Setup phase!");
		System.out.println("The robber starts in position ["+rx+";"+ry+"] And the cop starts in position ["+cx+";"+cy+"]");
		for(int i = 1; i <= t; i++) {
			
			int newrx=rx+randomizer.random(s);
			if(newrx > n) newrx = n;
			else if (newrx < 0) newrx = 0;
			int newry=ry+randomizer.random(s);
			if(newry > n) newry = n;
			else if (newry < 0) newry = 0;
			int newcx = cx;
			if (newrx>cx) newcx = cx+Math.abs(randomizer.random(s));
			else if (newrx<cx) newcx=cx-Math.abs(randomizer.random(s));
			if(newcx > n) newcx = n;
			else if (newcx < 0) newcx = 0;
			int newcy = cy;
			if (newry>cy) newcy = cy+Math.abs(randomizer.random(s));
			else if (newry<cy) newcy=cy-Math.abs(randomizer.random(s));		
			if(newcy > n) newcy = n;
			else if (newcy < 0) newcy = 0;
			System.out.println("["+newrx+";"+newry+"] ["+newcx+";"+newcy+"]");
			rx = newrx;
			ry = newry;
			cx = newcx;
			cy = newcy;
			
			if((newrx == newcx) && (newry == newcy)) {
				System.out.print("The cop caught the robber! And it only took him "+(i)+" turns!");
				return;	
			}
		}
		System.out.print("The robber got away! Better turn in your gun and your badge.");
	}
	
		
	
}