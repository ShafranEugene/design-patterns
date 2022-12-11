package structural.adapter;

public class USB implements Cable{

    @Override
    public void connect(){
        System.out.println("Connect USB");
    }
}
