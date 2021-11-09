package demoPrincipleFollows;

public class CreditCard implements PaymentMethod{
    public void doTransaction(double amount)
    {
        System.out.println("Payment using credit card : "+ amount);
    }
}
