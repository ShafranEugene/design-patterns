package creational.factory_method.factories;

import creational.factory_method.icecream.IceCream;
import creational.factory_method.icecream.StrawberryIceCream;

public class FactoryStrawberryIceCream implements Factory{
    @Override
    public IceCream getIceCream() {
        return new StrawberryIceCream();
    }
}
