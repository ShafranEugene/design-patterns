package creational.abstract_factory;

import creational.abstract_factory.factory.BlueFactory;
import creational.abstract_factory.factory.Factory;
import creational.abstract_factory.factory.FactoryHandler;
import creational.abstract_factory.factory.FactoryType;
import creational.abstract_factory.factory.GreenFactory;

public class AbstractFactory {
    private static FactoryHandler factoryHandler = new FactoryHandler();
    public static Factory getFactoryUseSwitch(FactoryType type){
        return switch (type) {
            case GREEN -> new GreenFactory();
            case BLUE -> new BlueFactory();
        };
    }

    public static Factory getFactoryUseMap(FactoryType type){
        return factoryHandler.getFactory(type.getId());
    }
}
