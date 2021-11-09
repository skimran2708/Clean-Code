package demoPrincipleFollows;

public class Main {

    public static void main(String [] args){

        Subscriber subscription = new Subscriber();

         //FOR DSL BROADBAND IMPLEMENT BELOW CODE

        //Broadband reference with DSLBroadband object
        Broadband broadband = subscription.getBroadbandTypeObject("DSL","LOW_SPEED",6);
        BroadbandCost speed=new LowSpeed();
        //speed=new HighSpeed();
        broadband.getBroadbandCost(speed,broadband);
        PaymentMethod paymentMethod=new DebitCard();
        //PaymentMethod paymentMethod=new CreditCard();
        BillManagement billManagement=new BillManagement(paymentMethod);
        billManagement.billPayment(broadband.cost);



         // FOR CABLEMODEM BROADBAND IMPLEMENT BELOW CODE

        //Broadband reference with CableModem object
        broadband =  subscription.getBroadbandTypeObject("CableModem","LOW_SPEED",6);
        speed=new LowSpeed();
        //speed=new HighSpeed();
        broadband.getBroadbandCost(speed,broadband);
        CableModemBroadband cmb= (CableModemBroadband) broadband;
        double setTopBoxCost = cmb.getSetTopBoxCost();
        paymentMethod=new DebitCard();
        //PaymentMethod paymentMethod=new CreditCard();
        billManagement=new BillManagement(paymentMethod);
        billManagement.billPayment(broadband.cost+setTopBoxCost);

        //
    }
}
