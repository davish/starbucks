public class Product {
	/** the price of each size */
	public double price;
	/** the cost of each size */
	public double cost;
	/** the name of the product */
	public String name;
	/** the amount of this product ordered in total */
	public double orderTotal; 
	
	public String toString() {	
		return name;
	}
	
	public Product(double price, double cost, String name) {
		this.name = name;
		this.price = price;
		this.cost = cost;
	}
}
