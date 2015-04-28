import java.util.LinkedList;
import java.util.List;


public class Store {
	/** all the orders in line at the store */
	public List<Product> orderHistory = new LinkedList<Product>();
	/** all the possible menu items */
	public List<Product> menu = new LinkedList<Product>();
	/** the amount of money the store has made */
	public int bank;
	
	/**
	 * Constructor for store
	 * adds all the menu items
	 * @param bank amount of $$ the starbucks starts with.
	 */
	public Store(int bank) {
		
	}
	
	/**
	 * take the product and process the order
	 */
	public void processOrder(Product p) {
		
	}	
	
	public String toString() {
		 return null;
	}
}
