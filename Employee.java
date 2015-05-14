
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
	}
	
	void determineHappiness() {
		if (wallet > threshold + 75) happiness = 6;
		else if (wallet > threshold + 25) happiness = 5;
		else if (wallet > threshold) happiness = 4;
		else if (wallet > threshold - 25) happiness = 3;
		else if (wallet > threshold - 75) happiness = 2;
		else happiness = 1;
	}
	
	boolean processOrder(Product p) {
		if (happiness / 5 >= Math.random()) {
			placeOfEmployment.processOrder(p);
			return true;
		} else {
			return false;
		}
	}
	
}
