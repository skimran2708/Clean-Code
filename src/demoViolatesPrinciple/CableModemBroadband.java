package demoViolatesPrinciple;

public class CableModemBroadband extends BroadbandPlan {

    public CableModemBroadband(String speed, int durationInMonths) {
        super(speed, durationInMonths);
    }

    // this violates open closed principle
    @Override
    public void getBroadbandCost(BroadbandPlan plan) {
        double calculatedCost  = 0;

        switch (plan.speed) {
            case "LOW_SPEED":
                calculatedCost =  4 * plan.durationInMonths * 250;
                break;
            case "HIGH_SPEED":
                calculatedCost = 4 * plan.durationInMonths * 350;
                break;
            default:
                System.out.println("Don't support this plan");
        }

        System.out.println("Cost for plan you have selected will be " + calculatedCost);
    }

    @Override
    public void getSetTopBoxTvCost() {
        System.out.println("You have to opt out separately for this ");
        double setTopBoxCost = 1000;
        System.out.println("You will be charged " + setTopBoxCost + " monthly");
    }


    public void getSubscription(String BroadbandType) {
        System.out.println("subscribed");
        super.getSubscription(BroadbandType);
    }
}
