package behavioral.template_method;

public class CafeA extends Cafe{
    @Override
    void bringSnake() {
        System.out.println("Served vegetables.");
    }

    @Override
    void bringLunch() {
        System.out.println("Served soup.");
    }

    @Override
    void bringDessert() {
        System.out.println("Served cake.");
    }
}
