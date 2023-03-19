package structural.decorator;

public class Pepper extends AdditionToPizza{

    public Pepper(Item item) {
        super(item, "Pepper");
    }

    @Override
    public double price() {
        return item.price() + 15.0;
    }
}
