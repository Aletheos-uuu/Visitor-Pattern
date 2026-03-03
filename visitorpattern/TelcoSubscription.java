package visitorpattern;
public interface TelcoSubscription {

    String accept(UsagePromo promo, double price);

    String accept(UnliCallOffer unliPackage, boolean unliCallText);

    String  getTelcoName();
    double  getPromoPrice();
    int     getDateAllowance();
    boolean getUnliCallText();
}
