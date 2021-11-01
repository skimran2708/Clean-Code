package demoPrincipleFollows;

// this class follows single responsibility principle and Open-closed principle
public class CostCalculation implements BroadbandCost {

    // this function accepts only two arguments, so this follows good function structure
    @Override
    public double getPlanCost(BroadbandPlan plan, int BroadbandFactor){
            double cost = 0;
            switch (plan.speed) {
                case "LOW_SPEED":
                    cost =  BroadbandFactor * plan.durationInMonths * 250;
                    break;
                case "HIGH_SPEED":
                    cost = BroadbandFactor * plan.durationInMonths * 350;
                    break;
                default:
                    System.out.println("Don't support this plan");
            }
            return cost;
    }
}
