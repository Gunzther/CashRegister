package cash_register;

public class TaxNY implements Tax{

	@Override
	public double calculateTax(double purchase) {
		if (purchase > 100) purchase = purchase + (purchase*0.08);
		return purchase;
	}
	
}
