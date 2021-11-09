package demoViolatesPrinciple;

//violates Dependency Inversion Principle
//BillManagement depends on CreditCard and DebitCard modules (i.e lower modules)

//Even it violates Open-close Principle

public class BillManagement {
    public DebitCard debitCard;
    //public CreditCard creditCard;
    public BillManagement(DebitCard debitCard)
    {
        this.debitCard=debitCard;
        //this.creditCard=creditCard;
    }
    public void billPayment(double amount) {
        debitCard.doTransaction(amount);
    }
}
