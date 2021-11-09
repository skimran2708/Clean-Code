package demoPrincipleFollows;

//follows Dependency Inversion Principle
public class BillManagement {
    public PaymentMethod paymentMethods;
    public BillManagement(PaymentMethod paymentMethods)
    {
        this.paymentMethods=paymentMethods;
    }
    public void billPayment(double amount)
    {
        paymentMethods.doTransaction(amount);
    }
}
