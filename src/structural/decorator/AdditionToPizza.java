package structural.decorator;

public abstract class AdditionToPizza implements Item{
    protected final Item item;
    private final String name;

    public AdditionToPizza(Item item, String name) {
        this.item = item;
        this.name = name;
    }

    @Override
    public String description() {
        return item.description() + ", +" + name;
    }
}
