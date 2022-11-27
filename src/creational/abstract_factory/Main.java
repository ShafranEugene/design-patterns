package creational.abstract_factory;

import creational.abstract_factory.box.Box;
import creational.abstract_factory.conveyor.Conveyor;
import creational.abstract_factory.factory.Factory;
import creational.abstract_factory.factory.FactoryType;

public class Main {
    public static void main(String[] args) {
        Factory factory = AbstractFactory.getFactoryUseSwitch(FactoryType.GREEN);
        Box box = factory.getBox();
        Conveyor conveyor = factory.getConveyor();

        System.out.println(box.getSize());
        System.out.println(conveyor.getSpeed());

        factory = AbstractFactory.getFactoryUseSwitch(FactoryType.BLUE);
        box = factory.getBox();
        conveyor = factory.getConveyor();
        System.out.println(box.getSize());
        System.out.println(conveyor.getSpeed());

        System.out.println("---------------------------------");

        factory = AbstractFactory.getFactoryUseMap(FactoryType.GREEN);
        box = factory.getBox();
        conveyor = factory.getConveyor();

        System.out.println(box.getSize());
        System.out.println(conveyor.getSpeed());

        factory = AbstractFactory.getFactoryUseMap(FactoryType.BLUE);
        box = factory.getBox();
        conveyor = factory.getConveyor();
        System.out.println(box.getSize());
        System.out.println(conveyor.getSpeed());
    }
}
