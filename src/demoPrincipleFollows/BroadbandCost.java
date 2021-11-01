package demoPrincipleFollows;

// this interface follows dependency inversion principle
public interface BroadbandCost {
    double getPlanCost(BroadbandPlan plan, int BroadbandFactor);
}
