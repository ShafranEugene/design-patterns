package creational.factory_method;

import creational.factory_method.factories.Factory;
import creational.factory_method.icecream.IceCream;
import creational.factory_method.icecream.TypesOfIceCream;

public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory(TypesOfIceCream.CHOCOLATE);
        IceCream iceCream = factory.getIceCream();
        iceCream.buyAndEat();

        factory = Factory.getFactory(TypesOfIceCream.STRAWBERRY);
        IceCream iceCream1 = factory.getIceCream();
        iceCream1.buyAndEat();
    }

}
