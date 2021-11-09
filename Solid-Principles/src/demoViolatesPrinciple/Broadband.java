package demoViolatesPrinciple;

// this class violates single responsibility principle
public class Broadband implements CostCalculation {

    public String speed;
    public int durationInMonths;
    public double cost;

    public Broadband(String speed, int durationInMonths) {
        this.speed = speed;
        this.durationInMonths = durationInMonths;
    }


    void getSubscription(String BroadbandType){
        if(BroadbandType.equals("DSL")){
            System.out.println("You have opted for DSL broadband");
        }
        else if(BroadbandType.equals("CableModem")){
            System.out.println("You have opted for CableMode broadband");
        }
    }

    @Override
    public void getBroadbandCost(Broadband plan) {
        BroadbandCost broadbandCost = new BroadbandCost();
        this.cost = broadbandCost.getCalculatedCost(plan);

        System.out.println("Cost for plan you have selected will be " + this.cost);
    }


    @Override
    public double getSetTopBoxCost() {
        System.out.println("You have opted out separately for SetTop Box ");
        double setTopBoxCost = 700;

        System.out.println("You will be charged " + setTopBoxCost + " monthly for SetTop Box");
        return setTopBoxCost;
    }
}
