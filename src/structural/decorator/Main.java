package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Pepperoni();
        item1 = new Cheese(item1);
        item1 = new Pepper(item1);

        System.out.println(item1.description());
        System.out.println(item1.price());
        System.out.println("-----------------");

        Item item2 = new Carbonara();
        item2 = new Pepper(item2);
        System.out.println(item2.description());
        System.out.println(item2.price());
    }
}
