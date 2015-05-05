import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;


public class Store {
	/** all the orders in line at the store */
	public List<Product> orderHistory = new LinkedList<Product>();
	/** all the possible menu items */
	public List<Product> menu = new LinkedList<Product>();
	/** the amount of money the store has made */
	public double bank;

	/**
	 * Constructor for store
	 * adds all the menu items
	 * @param bank amount of $$ the starbucks starts with.
	 */
	public Store(double bank) {

		this.bank = bank;
		
		menu.add(new Product(2.59, 1.10, "Iced Coffee"));
		menu.add(new Product(3.49, 1.80, " Iced Tea Lemonade"));
		menu.add(new Product(2.49, 1.00, "Iced Tazo Tea"));
		menu.add(new Product(2.19, 1.00, "Fresh Brew"));
		menu.add(new Product(2.19, 1.00, "Caffe Misto"));
		menu.add(new Product(2.49, 1.10, "Chai Tea Latte"));
		menu.add(new Product(3.49, 1.80, "Hot Chocolate"));
		menu.add(new Product(2.49, 1.10, "Caramel Frap"));
		menu.add(new Product(4.29, 2.20, "Coffe Frap"));
		menu.add(new Product(4.99, 2.40, "Green Tea Frap"));
		menu.add(new Product(4.29, 2.20, "Vanilla Bean Frap"));
		menu.add(new Product(4.49, 2.20, "Smoothie"));
		menu.add(new Product(4.79, 2.30, "Caramel Machiato"));
		menu.add(new Product(4.79, 2.30, "White Chocolate Mocha"));
		menu.add(new Product(3.99, 1.90, "Latte"));
		menu.add(new Product(4.59, 2.80, "Mocha"));
		menu.add(new Product(4.79, 2.30, "Iced Caffe Mocha"));
		menu.add(new Product(4.59, 2.80, "Skinny Vanilla Latte"));
		menu.add(new Product(6.00, 5.90, "ORANGE MOCHA FRAPPACHINO!!!"));
		
		

	}

	/**
	 * take the product and process the order
	 */
	public void processOrder(Product p) {

		orderHistory.add(p);
		bank = bank + (p.price - p.cost);

	}	

	public String toString() {
		
		return new DecimalFormat("#.00").format(bank);
//		return Math.floor(bank * 1000)/1000 + " ";
//		return bank + "";
	}
}
