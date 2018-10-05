// fibonacci.java
// calculate first 12 elements of Fibonacci list
// by Carolina Ferraz

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.print("The first 12 Fibonacci numbers are:");
		System.out.println();
		
		//declare 1st 2 elements on the list to feed loop calculation
		int f1 = 0, f2 = 1;
		
        for (int i = 1; i <= 12; i++) {
            System.out.print(f1 + " ");

            int sum = f1 + f2; // add 2 consecutive numbers
            f1 = f2; // move variable to next element for new calculation
            f2 = sum;
        }
	}
}
