package demoPrincipleFollows;

// this class follows Liskov substitution problem
public class CableModemBroadband extends Broadband implements SetTopBoxCost {

    public CableModemBroadband(String speed, int durationInMonths) {
        super(speed, durationInMonths);
    }

    public void getBroadbandCost(BroadbandCost speed, Broadband plan) {
        super.cost=speed.getCalculatedCost(plan);
        System.out.println("Cost for plan you have selected will be " + plan.cost);
    }

    public double getSetTopBoxCost(){
        System.out.println("You have opted out separately for SetTop Box ");
        double setTopBoxCost = 700;
        System.out.println("You will be charged " + setTopBoxCost + " monthly for SetTop Box");
        return setTopBoxCost;
    }
}
