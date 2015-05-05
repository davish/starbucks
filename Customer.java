import java.util.Random;


public class Customer {
	
	public Random ran = new Random();
	
	/** the amount the customer has paid in his lifetime */
	public int totalPaid;
	
	/**
	 * pick product from the store's menu.
	 * add cost to totalPaid
	 * @return the product to be placed
	 */
	public Product placeOrder(Store s) {
		
		int order = ran.nextInt(s.menu.size());
		Product p = s.menu.get(order);
		totalPaid += p.price;
		
		s.processOrder(p);
		
		return p;
	}
	
	public String toString() {
		return totalPaid + "";
	}

}
