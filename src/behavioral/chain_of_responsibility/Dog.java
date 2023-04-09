package behavioral.chain_of_responsibility;

import java.awt.Color;

public class Dog {
    private final int weight;
    private final Color color;
    private final int age;

    public Dog(int weight, Color color, int age) {
        this.weight = weight;
        this.color = color;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
