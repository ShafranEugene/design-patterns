package structural.composite;

public class Main {
    public static void main(String[] args) {
        Box redBox = new Box();
        redBox.add(new Item(5));
        redBox.add(new Item(5));
        redBox.add(new Item(5));

        Box blueBox = new Box();
        blueBox.add(new Item(2));
        blueBox.add(new Item(2));

        Box greenBox = new Box();
        greenBox.add(new Item(1));

        blueBox.add(greenBox);
        redBox.add(blueBox);

        System.out.println("Total price:" + redBox.getPrice());
    }
}
