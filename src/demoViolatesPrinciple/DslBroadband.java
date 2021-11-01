package demoViolatesPrinciple;


public class DslBroadband extends BroadbandPlan {

    public DslBroadband(String speed, int durationInMonths) {
        super(speed, durationInMonths);
    }

    // this violates open closed principle
    @Override
    public void getBroadbandCost(BroadbandPlan plan) {
        DslBroadband dslBroadband = new DslBroadband("LOW_SPEED", 6);
        double calculatedCost  = 0;

        switch (plan.speed) {
            case "LOW_SPEED":
                calculatedCost =  2 * plan.durationInMonths * 250;
                break;
            case "HIGH_SPEED":
                calculatedCost = 2 * plan.durationInMonths * 350;
                break;
            default:
                System.out.println("Don't support this plan");
        }

        System.out.println("Cost for plan you have selected will be " + calculatedCost);
    }

    @Override
    public void getSubscription(String BroadbandType) {
        System.out.println("subscribed");
        super.getSubscription(BroadbandType);
    }

    // this violates Liskov substitution principle

//    @Override
//    public void getSetTopBoxTvCost() {
//        System.out.println("Not Valid for this broadband");
//    }
}
