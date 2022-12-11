package structural.adapter;

public class TypeCAdapter implements Cable{
    private final TypeC typeC;

    public TypeCAdapter(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void connect() {
        typeC.connect();
    }
}
