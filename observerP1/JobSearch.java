package observerP1;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("Junior Java Developer");
        jobSite.addVacancy("Senior Java developer");

        Observer FirstSubscriber = new Subscriber("Baurzhan");
        Observer SecondSubscriber = new Subscriber("Fill");

        jobSite.addObserver(FirstSubscriber);
        jobSite.addObserver(SecondSubscriber);

        jobSite.addVacancy("Middle Java Developer");

        jobSite.removeVacancy("Junior Java Developer");
    }
}
