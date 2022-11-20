package behavioral.strategy;

public class FindingCar implements Work{
    @Override
    public void doWork() {
        System.out.println("Finding a truck");
    }
}
