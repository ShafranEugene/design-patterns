package structural.proxy;

public class BankCard implements Card{
    private double money;

    @Override
    public void putMoney(double money) {
        this.money += money;
    }

    @Override
    public double amountOnAccount() {
        return money;
    }
}
