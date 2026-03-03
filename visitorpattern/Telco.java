package visitorpattern;
public class Telco implements TelcoSubscription {

    public static final String Smart = "Smart";
    public static final String Globe = "Globe";
    public static final String Ditto = "Ditto";

    private String  telcoName;
    private double  promoPrice;
    private int     dateAllowance;
    private boolean unliCallText;

    public Telco(int dateAllowance, double promoPrice,
                 String telcoName, boolean unliCallText) {
        this.dateAllowance = dateAllowance;
        this.promoPrice    = promoPrice;
        this.telcoName     = telcoName;
        this.unliCallText  = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(this.telcoName, price);
    }

    @Override
    public String accept(UnliCallOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallsTextOffer(this.telcoName, unliCallText);
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public double getPromoPrice() {
        return promoPrice;
    }

    @Override
    public int getDateAllowance() {
        return dateAllowance;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }
}