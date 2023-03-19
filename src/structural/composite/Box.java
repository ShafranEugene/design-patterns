package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component{

    private List<Component> componentList = new ArrayList<>();

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public int getPrice() {
        int price = 0;
        for(Component component : componentList){
            price += component.getPrice();
        }
        return price;
    }
}
