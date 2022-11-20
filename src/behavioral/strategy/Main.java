package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setWork(new AnsweringToQuestion());
        employee.whatDo();

        employee.setWork(new FindingCar());
        employee.whatDo();
    }
}
