package structural.facade;

public class Main {
    public static void main(String[] args) {
        SalesDepartment facade = new SalesDepartment();
        Item item = facade.buy(250);
        int money = facade.returnTheGoods(item);
        System.out.println(money);
    }
}
