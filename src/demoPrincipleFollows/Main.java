package demoPrincipleFollows;

public class Main {

    public static void main(String [] args){
        // for DSL broadband

//        BroadbandPlan newBroadBandConnection = new BroadbandPlan();
//        newBroadBandConnection.setSpeed("LOW_SPEED");
//        newBroadBandConnection.setDurationInMonths(3);

        Subscriber subscription = new Subscriber();
        BroadbandPlan broadbandPlan =  subscription.getBroadbandTypeObject("DSL","LOW_SPEED",6);

        broadbandPlan.getBroadbandCost(broadbandPlan);

        broadbandPlan =  subscription.getBroadbandTypeObject("CableModem","LOW_SPEED",6);

        broadbandPlan.getBroadbandCost(broadbandPlan);


        // for CableModem Broadband

//        BroadbandPlan newBroadBandConnection2 = new BroadbandPlan();
//        newBroadBandConnection2.setSpeed("HIGH_SPEED");
//        newBroadBandConnection2.setDurationInMonths(6);
//
//
//        Subscriber subscription2 = new Subscriber();
//        BroadbandPlan broadbandPlan2 =  subscription2.getBroadbandTypeObject("CableModem");
//
//        broadbandPlan2.getBroadbandCost(newBroadBandConnection2);
//
//        CableModemBroadband cableModemBroadband = new CableModemBroadband();
//        cableModemBroadband.getSetTopBoxCost();


    }
}
