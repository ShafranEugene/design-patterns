package structural.proxy;

public class BankProxyCard implements Card{

    private static final double BANK_COMMISSION = 3.4;

    private final BankCard bankCard;

    public BankProxyCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public void putMoney(double money) {
        if(money > 10){
            bankCard.putMoney(money - BANK_COMMISSION);
        } else {
            bankCard.putMoney(money);
        }
    }

    @Override
    public double amountOnAccount() {
        return bankCard.amountOnAccount();
    }
}
