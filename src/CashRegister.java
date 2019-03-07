public class CashRegister {
    private double purchase; // total amount of product price bought
    private double payment;  // total amount of payment
    private Tax tax;

    public CashRegister(Tax tax) {
        this.purchase = 0;
        this.payment = 0;
        this.tax = tax;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void calculateTax() {
        purchase = tax.calculateTax(purchase);
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
