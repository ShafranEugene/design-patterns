package behavioral.strategy;

public class AnsweringToQuestion implements Work{
    @Override
    public void doWork() {
        System.out.println("Write answer...");
    }
}
