package structural.facade;

import java.util.HashMap;
import java.util.Map;

public class AccountingDepartment {
    private Map<Item,Integer> items = new HashMap<>();

    public void depositMoney(Item item,int money) {
        items.put(item,money);
    }

    public int returnMoney(Item item) {
        return items.get(item);
    }
}
