package creational.abstract_factory.factory;

public enum FactoryType {
    GREEN(0,BlueFactory.class),
    BLUE(1,GreenFactory.class);

    private final int id;
    private final Class<? extends Factory> factoryClass;

    FactoryType(int id, Class<? extends Factory> factoryClass) {
        this.id = id;
        this.factoryClass = factoryClass;
    }

    public int getId() {
        return id;
    }

    public Class<? extends Factory> getFactoryClass() {
        return factoryClass;
    }
}
