package demoPrincipleFollows;

// this class follows single responsibility principle
// class naming best practices (used noun)
public class BroadbandPlan implements Broadband{

    public String speed;
    public int durationInMonths;

    public BroadbandPlan(String speed, int durationInMonths) {
        this.speed = speed;
        this.durationInMonths = durationInMonths;
    }

    @Override
    public void getBroadbandCost(BroadbandPlan plan) {
        CostCalculation cost = new CostCalculation();
        double calculatedCost  = cost.getPlanCost(plan, 1);

        System.out.println("Cost for plan you have selected will be " + calculatedCost);
    }
}
