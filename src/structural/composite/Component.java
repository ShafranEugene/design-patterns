package structural.composite;

public interface Component {
    default void add(Component component){
        throw new UnsupportedOperationException();
    }
    default void remove(Component component){
        throw new UnsupportedOperationException();
    }
    int getPrice();
}
