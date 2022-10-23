package creational.factory_method.icecream;

public class ChocolateIceCream implements IceCream{
    @Override
    public void buyAndEat() {
        System.out.println("Mmm, such delicious ice cream, but it cost me $2.");
    }
}
