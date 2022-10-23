package creational.factory_method.factories;

import creational.factory_method.icecream.IceCream;
import creational.factory_method.icecream.TypesOfIceCream;

public interface Factory {

    IceCream getIceCream();

    public static Factory getFactory(TypesOfIceCream type){
        if(type == TypesOfIceCream.CHOCOLATE){
            return new FactoryChocolateIceCream();
        } else if(type == TypesOfIceCream.STRAWBERRY){
            return new FactoryStrawberryIceCream();
        } else {
            throw new RuntimeException();
        }
    }
}
