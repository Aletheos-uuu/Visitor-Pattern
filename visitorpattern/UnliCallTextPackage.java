package visitorpattern;
public class UnliCallTextPackage implements UnliCallOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (!unliCallText) {
            // Smart: no unli bundle — charged per use
            return telcoName + " does not offer unlimited calls and texts. "
                 + "You will be charged per use.";
        }

        switch (telcoName) {
            case Telco.Globe:
                // Globe: unli within network only
                return "Globe offers unlimited calls and texts to Globe subscribers. "
                     + "Calls and texts to other networks are charged extra.";

            case Telco.Ditto:
                // Ditto: unli to ALL networks
                return "Ditto offers unlimited calls and texts to ALL networks "
                     + "within the country.";

            default:
                return telcoName + " offers unlimited calls and texts.";
        }
    }
}