package behavioral.template_method;

public class CafeB extends Cafe{
    @Override
    void bringSnake() {
        System.out.println("Served salad.");
    }

    @Override
    void bringLunch() {
        System.out.println("Served steak.");
    }

    @Override
    void bringDessert() {
        System.out.println("Served ice cream.");
    }
}
