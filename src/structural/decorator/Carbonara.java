package structural.decorator;

public class Carbonara extends Pizza{
    public Carbonara() {
        super("Carbonara");
    }

    @Override
    public double price() {
        return 119.00;
    }
}
