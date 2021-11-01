package demoViolatesPrinciple;

// this violates interface segregation principle
public interface Broadband {
    void getBroadbandCost(BroadbandPlan plan);
    void getSetTopBoxTvCost();
}
