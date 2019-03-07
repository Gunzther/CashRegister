package cash_register;

public class TaxThailand implements Tax{

	@Override
	public double calculateTax(double purchase) {
		return purchase = purchase + (purchase*0.07);
	}
	
}
