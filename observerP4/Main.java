package observerP4;

public class Main {
    public static void main(String[] args) {
        Stud st = new Stud("Baur");
        Porter port = new Porter();
        port.addObserver(st);

        port.notifyObserver();

        port.removeObserver(st);
    }
}
