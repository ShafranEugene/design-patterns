package structural.flyweight;

public class Toy {
    private final int height;
    private final String color;
    private final ToyType toyType;

    public Toy(int height, String color, ToyType toyType) {
        this.height = height;
        this.color = color;
        this.toyType = toyType;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public ToyType getToyType() {
        return toyType;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "height=" + height +
                ", color='" + color + '\'' +
                ", toyType=" + toyType +
                '}';
    }
}
