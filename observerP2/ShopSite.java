package observerP2;

import observerP1.Observed;

public class ShopSite {
    public static void main(String[] args) {
        MarketPlace market = new MarketPlace();

        CusObserver cus = new Customers("Baurzhan");

        market.addCustomer(cus);
        market.addProducts("Gta 5");

    }

}
