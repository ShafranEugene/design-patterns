package creational.factory_method.icecream;

public enum TypesOfIceCream {
    CHOCOLATE("chocolate"),
    STRAWBERRY("strawberry");

    private final String name;

    TypesOfIceCream(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
