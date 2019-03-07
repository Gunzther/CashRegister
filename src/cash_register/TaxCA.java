package cash_register;

public class TaxCA implements Tax{

	@Override
	public double calculateTax(double purchase) {
		return purchase + (purchase * 0.075);
	}
	
}
