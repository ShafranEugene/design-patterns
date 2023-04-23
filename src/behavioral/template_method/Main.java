package behavioral.template_method;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new CafeA();
        cafe.bringLunch();
        cafe.bringBill();

        cafe = new CafeB();
        cafe.bringDessert();
        cafe.bringBill();
    }
}
