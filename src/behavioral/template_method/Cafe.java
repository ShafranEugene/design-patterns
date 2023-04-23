package behavioral.template_method;

public abstract class Cafe {

    public void bringBill() {
        System.out.println("The waiter carries the bill.");
    }

    abstract void bringSnake();

    abstract void bringLunch();

    abstract void bringDessert();
}
