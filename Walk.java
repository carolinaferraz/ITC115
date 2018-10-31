import java.util.Random;
public class Walk {

	public static void main(String[] args) {
		randomWalk();
	}
	
	public static void randomWalk() {
		
		Random rand = new Random();
		int position = 0; 
		int big = 0; // biggest number
		
		System.out.println("position = " + position); // fence post
		
		while (position != 3 && position !=-3) { 
			int guess = rand.nextInt(2) * 2 - 1;
			position = position + guess;
			
			big = Math.max(big, position);
			System.out.println("position = " + position);
			
		}
		
		System.out.println("max position = " + big);
		}
		
}