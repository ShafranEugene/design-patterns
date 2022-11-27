package creational.abstract_factory.factory;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class FactoryHandler {
    private final HashMap<Integer,Class<? extends Factory>> factoryHashMap = new HashMap<>();

    public FactoryHandler() {
        for(FactoryType type : FactoryType.values()){
            factoryHashMap.put(type.getId(),type.getFactoryClass());
        }
    }

    public Factory getFactory(int id){
        try {
            return factoryHashMap.get(id).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public Factory getFactory(FactoryType type){
        return getFactory(type.getId());
    }
}
