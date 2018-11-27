
public class ProductMain{

	public static void main(String[] args) {
		//create 3 products
		Product p1 = new Product("01fs4", "seahorse", 13.645);
		Product p2 = new Product ("02fs4", "clownfish", 15.580);
		Product p3 = new Product("03fs4", "jellyfish", 23.499);
		
		System.out.println(p1);
		
		System.out.println(p2);
		
		System.out.println(p3);
		
		System.out.println("inventory: " + p1.getCount());
		

	}

}
