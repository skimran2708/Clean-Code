package demoPrincipleFollows;

//This class follows Liskov Substitution Principle
public class DslBroadband extends Broadband {

    public DslBroadband(String speed, int durationInMonths) {
        super(speed, durationInMonths);
    }

    public void getBroadbandCost(BroadbandCost speed, Broadband plan) {
        super.cost=speed.getCalculatedCost(plan);

        System.out.println("Cost for plan you have selected will be " + plan.cost);
    }

}
