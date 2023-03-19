package structural.decorator;

public abstract class Pizza implements Item{
    private final String name;

    public Pizza(String name) {
        this.name = name;
    }

    @Override
    public String description() {
        return "Pizza: " + name;
    }
}
