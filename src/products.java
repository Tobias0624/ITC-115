import java.text.NumberFormat;
import java.util.*; 
public class products {
	
	//Class Variable
	private static int count; 
	
	//Instance Variables
	private String productCode; 
	private String description; 
	private double price; 
	private int productCount; 
	
	/**
	 * 
	*/
	public products(String productCode, String description, double price, int productCount ) {
		this.productCode = productCode; 
		this.description = description; 
		this.price = price; 
		this.productCount = productCount; 
		
		//Increment count 
		count += 1; 
		
		//Get the count of total products in the inventory
		// count += productCount; 
	}
		
		/**
		 * a method that returns the number of products objects created
		 */
		public static int getCount(){
			return count; 
		}
		/**
		 * method that returns the product description 
		 */
		public String getProductCode() {
			return productCode;
		}
		public String getDescription() {
			return description; 
	}
		/**
		 * method that returns that price of the product
		 */
		public double getPrice() {
			return price; 
		}
		/**
		 * method that sets the product code
		 */
		public int getProductCount() {
			return productCount;
		}
		/**
		 * Method that sets the product code
		 */
		public void setProductCode(String productCode) {
			this.productCode = productCode; 
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public void setProductCount(int productCount) {
			this.productCount = productCount;
			}
		
		public String getPriceFormatted() {
			String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
			return formattedPrice; 
		}

		public String toString() {
			return "Product Code: " + productCode + "\nDescription" + description + "\nCount:" +
		"productCount" + "\nPrice: " + getPriceFormatted();
		}
		
}