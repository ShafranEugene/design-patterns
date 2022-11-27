package creational.abstract_factory.factory;

import creational.abstract_factory.box.BlueBox;
import creational.abstract_factory.box.Box;
import creational.abstract_factory.conveyor.BlueConveyor;
import creational.abstract_factory.conveyor.Conveyor;

public class BlueFactory implements Factory{
    @Override
    public Box getBox() {
        return new BlueBox();
    }

    @Override
    public Conveyor getConveyor() {
        return new BlueConveyor();
    }
}
