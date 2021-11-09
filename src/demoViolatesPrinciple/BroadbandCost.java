package demoViolatesPrinciple;

//this class violates open-close Principle

public class BroadbandCost {
    public double getCalculatedCost(Broadband plan) {
        double cost = 0;
        switch (plan.speed) {
            case "LOW_SPEED":
                cost = plan.durationInMonths * 250;
                break;
            case "HIGH_SPEED":
                cost = plan.durationInMonths * 350;
                break;
            default:
                System.out.println("Don't support this plan");
        }
        return cost;
    }
}
