package observerP1;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed{

    List<String> vacancies = new ArrayList<>();
    List<Observer> subs = new ArrayList<>();

    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subs.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subs.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subs) {
            observer.handleEvent(this.vacancies);
        }
    }
}
