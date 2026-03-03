package visitorpattern;
public class UnliCallTextPackage implements UnliCallOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (!unliCallText) {
            return telcoName + " does not offer unlimited calls and texts. "
                 + "You will be charged per use.";
        }

        switch (telcoName) {
            case Telco.Globe:
                return "Globe offers unlimited calls and texts to Globe subscribers. "
                     + "Calls and texts to other networks are charged extra.";

            case Telco.Ditto:
                return "Ditto offers unlimited calls and texts to ALL networks "
                     + "within the country.";

            default:
                return telcoName + " offers unlimited calls and texts.";
        }
    }
}