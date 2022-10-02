package observerP4;

import java.util.ArrayList;
import java.util.List;

public class Porter implements Observable{

    private List<Observer> list = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
        System.out.println("removed");
    }

    @Override
    public void notifyObserver() {
        for(Observer os: list){
            os.update();
        }
    }

    void breakDo(){
        notifyObserver();
    }
}
