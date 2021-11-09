package demoViolatesPrinciple;


public class DslBroadband extends Broadband {

    public DslBroadband(String speed, int durationInMonths) {
        super(speed, durationInMonths);
    }


    @Override
    public void getBroadbandCost(Broadband plan) {
        BroadbandCost broadbandCost = new BroadbandCost();
        super.cost  = broadbandCost.getCalculatedCost(plan);

        System.out.println("Cost for plan you have selected will be " + plan.cost);
    }

    @Override
    public void getSubscription(String BroadbandType) {
        System.out.print("Subscribed: ");
        super.getSubscription(BroadbandType);
    }


    // this violates Liskov substitution principle

    @Override
    public double getSetTopBoxCost() {
        System.out.println("SetTop Box Not Valid for this broadband");
        return 0;
    }
}
