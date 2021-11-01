package demoPrincipleFollows;

// this class follows single responsibility principle
public class Subscriber {

    public BroadbandPlan getBroadbandTypeObject(String broadbandType, String speed, int durationInMonths){

        switch (broadbandType) {
            case "DSL":
                System.out.println("You have opted for DSL broadband");
                return new DslBroadband(speed,durationInMonths);
            case "CableModem":
                System.out.println("You have opted for Cable Modem broadband");
                return new CableModemBroadband(speed,durationInMonths);
            default:
                System.out.println("give valid broadband type");
                return null;
        }
    }
}
