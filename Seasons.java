// Seasons-version2
// insert a date to find out what's the corresponding season of the year
// using a method called 'season'

import java.util.Scanner;

public class SeasonsV2 {

	public static void main(String[] args) {
		// introduction
		System.out.println("Insert date to find out its corresponding season.");
		System.out.println();

		// collect date
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter month (1-12): ");
		int mon = console.nextInt();
		System.out.print("Enter day (1-31): ");
		int day = console.nextInt();
		
		// output
		System.out.println(season(mon, day));
		console.close();
	}
		
		// season method
	public static String season(int mon, int day) {

		if ((mon==9 && day>=16)||(mon==12 && day<=15)||(mon==10||mon==11))
			return "Fall";
		else {
			if ((mon==3 && day>=16)||(mon==6 && day<=15)||(mon==4||mon==5))
				return "Spring";
			else {
				if ((mon==6 && day>=16)||(mon==9 && day<=15)||(mon==7||mon==8))
					return "Summer";
				else {
					return "Winter"; }}}}
}
