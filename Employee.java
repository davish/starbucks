
public class Employee {
	double wallet;
	double wage;
	int happiness;
	int threshold = 100;
	
	Store placeOfEmployment;
	
	
	public Employee(double wage, Store s) {
		this.wage = wage;
		this.placeOfEmployment = s;
	}
	
	void payDay() {
//		System.out.println("My bank account has "+wallet);
		wallet = wallet + wage;
		placeOfEmployment.bank = placeOfEmployment.bank - wage;
		wallet -= Math.random() * (wallet/10); // they spend a random amount of money every week, up to all of it
		determineHappiness();
	}
	
	void determineHappiness() {
		if (wallet > threshold + 75) happiness = 5;
		else if (wallet > threshold + 25) happiness = 4;
		else if (wallet > threshold) happiness = 3;
		else if (wallet > threshold - 25) happiness = 2;
		else if (wallet > threshold - 75) happiness = 1;
		else happiness = 0;
	}
	
	boolean processOrder(Product p) {
		if ((double)happiness / 5 >= Math.random()) {
			placeOfEmployment.processOrder(p);
			return true;
		} else {
			return false;
		}
	}
	
}
