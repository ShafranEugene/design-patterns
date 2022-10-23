package creational.factory_method.icecream;

public class StrawberryIceCream implements IceCream{
    @Override
    public void buyAndEat() {
        System.out.println("Mmm, such delicious ice cream, but it cost me $3.");
    }
}
