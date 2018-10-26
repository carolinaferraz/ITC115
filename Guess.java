// Write a method called makeGuesses that guesses numbers 
// between 1-50 inclusive until it makes a guess of at least 48.
// It should report each guess & total number of guesses made. 

import java.util.Random;

public class Guess {

	public static void main(String[] args) {
		makeGuesses();
	}
	
	public static void makeGuesses() {
		
		Random rand = new Random();
		int wrong = 0;
		int guess;
		
		do { 
			guess = rand.nextInt(50) + 1;
			wrong++;
			System.out.println("guess = " + guess);
			
		} while (guess <= 47);
		
		System.out.println("total guesses = " + wrong);	
	}
}