// Write a method called printPowersOfN that accepts a base and an exponent
// as args and prints each power of the base from base0 (1) up to that max power
// p.190 e3 - by Carolina Ferraz

public class PoN {

	public static void main(String[] args) {

		printPowersOfN(2,7);
		printPowersOfN(5,3);
			
	}
	// method with loop using Math.pow
	
	public static void printPowersOfN(int b, int e) { //base and exponent 
		for(int i = 0; i <= e; i++) {
			int result = (int) Math.pow(b, i);
			System.out.print(result + " ");
		}
		System.out.println();
	}	
}