package observerP2;

import observerP1.Observer;

import java.util.ArrayList;
import java.util.List;

public class MarketPlace implements CusObserverd{

    List<String> products = new ArrayList<>();
    List<CusObserver> customers = new ArrayList<>();

    public void removeProducts(String product){
        this.products.remove(product);
    }

    public void addProducts(String product){
        this.products.add(product);
    }


    @Override
    public void addCustomer(CusObserver cusobs) {
        this.customers.add(cusobs);
    }

    @Override
    public void deleteCustomer(CusObserver cusobs) {
        this.customers.remove(cusobs);
    }

    @Override
    public void notifyCustomer() {
        for(CusObserver cusobs: customers){
            cusobs.Notification(this.products);
        }
    }
}
