package behavioral.strategy;

public class CleaningOffice implements Work{
    @Override
    public void doWork() {
        System.out.println("Washing a floor");
    }
}
