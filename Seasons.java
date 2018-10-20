//insert a date to find out what's the corresponding season of the year.

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		System.out.println("Insert date to find out "
				+ "its corresponding season!");
		System.out.println();
		
		
		// create an instance of an object of type Scanner
		Scanner console = new Scanner(System.in);
		
		// collect date 
		System.out.print("Enter month (1-12): ");
		int mon = console.nextInt();
		System.out.print("Enter day (1-31): ");
		int day = console.nextInt();
		console.close();
		
		// seasons parameters
		
		if((mon==12 && day>=16)||(mon==3 && day<=15)||(mon==1||mon==2)) {
			System.out.println("Winter");
			
		} else if((mon==3 && day>=16)||(mon==6 && day<=15)||(mon==4||mon==5)) {
			System.out.println("Spring");
			
		} else if((mon==6 && day>=16)||(mon==9 && day<=15)||(mon==7||mon==8)) {
			System.out.println("Summer");
			
		} else if((mon==9 && day>=16)||(mon==12 && day<=15)||(mon==10||mon==11)) {
			System.out.println("Fall");
		}		
	}
}