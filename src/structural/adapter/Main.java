package structural.adapter;

public class Main {
    public static void main(String[] args) {
        Cable cable = new USB();
        cable.connect();
        cable = new TypeCAdapter(new TypeC());
        cable.connect();
    }
}
