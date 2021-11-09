package demoViolatesPrinciple;

public class CableModemBroadband extends Broadband {

    public CableModemBroadband(String speed, int durationInMonths) {
        super(speed, durationInMonths);
    }

    @Override
    public void getBroadbandCost(Broadband plan) {
        BroadbandCost broadbandCost = new BroadbandCost();
        super.cost  = broadbandCost.getCalculatedCost(plan);

        System.out.println("Cost for plan you have selected will be " + plan.cost);
    }

    @Override
    public double getSetTopBoxCost() {
        System.out.println("You have opted out separately for SetTop Box ");
        double setTopBoxCost = 500;
        System.out.println("You will be charged " + setTopBoxCost + " monthly for SetTop Box");
        return setTopBoxCost;
    }


    public void getSubscription(String BroadbandType) {
        System.out.print("Subscribed: ");
        super.getSubscription(BroadbandType);
    }
}
