package observerP4;

public class Stud implements Observer{
    private String name;

    public Stud(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("YEAAAHH " + name);
    }
}
