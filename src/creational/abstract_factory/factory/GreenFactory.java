package creational.abstract_factory.factory;

import creational.abstract_factory.box.Box;
import creational.abstract_factory.box.GreenBox;
import creational.abstract_factory.conveyor.Conveyor;
import creational.abstract_factory.conveyor.GreenConveyor;

public class GreenFactory implements Factory{
    @Override
    public Box getBox() {
        return new GreenBox();
    }

    @Override
    public Conveyor getConveyor() {
        return new GreenConveyor();
    }
}
