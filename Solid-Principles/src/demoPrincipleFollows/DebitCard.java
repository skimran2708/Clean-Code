package demoPrincipleFollows;

public class DebitCard implements PaymentMethod{
    public void doTransaction(double amount)
    {
        System.out.println("Payment using debit card : "+ amount);
    }
}
