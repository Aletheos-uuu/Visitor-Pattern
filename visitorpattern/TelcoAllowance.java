package visitorpattern;
public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double money) {
        String gbInfo;

        switch (telcoName) {
            case Telco.Smart: gbInfo = "15 GB"; break;
            case Telco.Globe: gbInfo = "10 GB"; break;
            case Telco.Ditto: gbInfo = "8 GB";  break;
            default:          gbInfo = "N/A";
        }

        return String.format("%s offers %s of data for ₱%.2f/month.",
                             telcoName, gbInfo, money);
    }
}
