package demoPrincipleFollows;

//follows OCP

public class HighSpeed implements BroadbandCost{
    public double getCalculatedCost(Broadband plan)
    {
        return plan.durationInMonths * 350;
    }
}
