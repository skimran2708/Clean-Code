package demoViolatesPrinciple;

public class Main {

    public static void main(String [] args){

        BroadbandPlan broadbandPlan;
//        broadbandPlan.getSubscription("DSL");
//
        DslBroadband dslBroadband = new DslBroadband("LOW_SPEED", 4);


        broadbandPlan = new CableModemBroadband("LOW_SPEED",6);

        broadbandPlan.getBroadbandCost(broadbandPlan);
        broadbandPlan.getSubscription("CableModem");

    }
}
