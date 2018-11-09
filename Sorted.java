// Write a method called isSorted that accepts an array of real numbers as a 
// parameter and returns true if the list is in sorted (nondecreasing) 
// order and false otherwise. 

public class Sorted {

	public static void main(String[] args) {
		double [] list1 = {16.1, 12.3, 22.2, 14.4};
		double [] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};

		System.out.println(isSorted(list1));
		System.out.println(isSorted(list2));
		}

	private static boolean isSorted(double[] ar) {
		
		// one-element array = sorted
		if (ar.length < 2) return true;

	    for (int i = 1; i < ar.length; i++) {
	       if (ar[i] < ar[i-1]){
	          return false;
	       }
	    }
	    return true;
	}
}

