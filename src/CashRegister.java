public class CashRegister {
    private double purchase; // total amount of product price bought
    private double payment;  // total amount of payment

    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void calculateTaxThailand() {
        purchase = purchase + (purchase*0.07);
    }

    public void calculateTaxNY() {
        if (purchase > 100)
            purchase = purchase + (purchase*0.08);
    }

    public void calculateTaxCA() {
        purchase = purchase + (purchase*0.075);
    }

    public void enterPayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
