import java.text.NumberFormat;

// assignment 7

public class Product {

	// fields
	private String code;
	private String description;
	private double price;
	private static int count = 0;

	// constructor
	public Product(String code, String description, double price) {
			this.code = code;
			this.description = description;
			this.price = price;	
			count++; 
		}
	
	public String getPriceFormatted() 
    {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Product.count = count;
	}
	
	//returns a String representation of the object
		public String toString() {
			return ("product code: " + code + " -- description: " + description + 
					" -- price: " + getPriceFormatted());
		}
}