package observerP2;

import observerP1.Observed;

import java.util.List;

public class Customers implements CusObserver {
    String name;

    public Customers(String name) {
        this.name = name;
    }

    @Override
    public void Notification(List<String> product) {
        System.out.println("Dear " + name + " today we have " + product);
    }

}
