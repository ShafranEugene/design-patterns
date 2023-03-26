package structural.facade;
//Facade
public class SalesDepartment {
    private final ProductionDepartment productionDepartment = new ProductionDepartment();
    private final AccountingDepartment accountingDepartment = new AccountingDepartment();

    public Item buy(int money){
        Item item = productionDepartment.makeItem();
        accountingDepartment.depositMoney(item,money);
        return item;
    }

    public int returnTheGoods(Item item){
        productionDepartment.takeApart(item);
        return accountingDepartment.returnMoney(item);
    }
}
