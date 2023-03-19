package structural.decorator;

public class Cheese extends AdditionToPizza{

    public Cheese(Item item) {
        super(item,"Cheese");
    }

    @Override
    public double price() {
        return item.price() + 30.0;
    }
}
