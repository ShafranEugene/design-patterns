package structural.decorator;

public class Pepperoni extends Pizza{
    public Pepperoni() {
        super("Pepperoni");
    }

    @Override
    public double price() {
        return 145.00;
    }
}
