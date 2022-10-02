package observerP4;

public interface Observable{

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
