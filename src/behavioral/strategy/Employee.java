package behavioral.strategy;

public class Employee {
    private Work work;

    public void setWork(Work work) {
        this.work = work;
    }

    public void whatDo(){
        work.doWork();
    }
}
