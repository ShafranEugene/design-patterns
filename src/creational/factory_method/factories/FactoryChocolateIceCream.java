package creational.factory_method.factories;

import creational.factory_method.icecream.ChocolateIceCream;
import creational.factory_method.icecream.IceCream;

public class FactoryChocolateIceCream implements Factory{
    @Override
    public IceCream getIceCream() {
        return new ChocolateIceCream();
    }
}
