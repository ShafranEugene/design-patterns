package structural.proxy;

public class CardFactory {

    public static Card createCard(){
        return new BankProxyCard(new BankCard());
    }
}
