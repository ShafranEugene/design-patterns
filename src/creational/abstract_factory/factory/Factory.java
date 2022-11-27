package creational.abstract_factory.factory;

import creational.abstract_factory.box.Box;
import creational.abstract_factory.conveyor.Conveyor;

public interface Factory {
    Box getBox();
    Conveyor getConveyor();
}
