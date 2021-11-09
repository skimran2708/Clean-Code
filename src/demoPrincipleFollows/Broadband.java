package demoPrincipleFollows;

// this class follows single responsibility principle
// class naming best practices (used noun)
public class Broadband{

    public String speed;
    public int durationInMonths;
    public double cost;

    public Broadband(String speed, int durationInMonths) {
        this.speed = speed;
        this.durationInMonths = durationInMonths;
    }


    public void getBroadbandCost(BroadbandCost speed, Broadband plan) {
        this.cost=speed.getCalculatedCost(plan);
        System.out.println("Cost for plan you have selected will be " + this.cost);
    }
}
