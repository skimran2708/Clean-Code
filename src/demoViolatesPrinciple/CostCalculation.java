package demoViolatesPrinciple;

// this violates interface segregation principle
public interface CostCalculation {
    void getBroadbandCost(Broadband plan);
    double getSetTopBoxCost();
}

