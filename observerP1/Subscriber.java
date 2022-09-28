package observerP1;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancy) {
        System.out.println("Hello " + name + " We have some changes in vacancies " + vacancy);
    }

    public void setName(String name) {
        this.name = name;
    }
}
