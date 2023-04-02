package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ToyFactory {
    private static final Map<String,ToyType> mapToyTypeByName = new HashMap<>();

    public static Toy createToy(String name,String color,int height){
        ToyType toyType = mapToyTypeByName.computeIfAbsent(name,toy -> new ToyType(name));
        return new Toy(height,color,toyType);
    }

    public static int getCountTypes(){
        return mapToyTypeByName.size();
    }
}
