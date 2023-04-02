package structural.proxy;

public class Main {
    public static void main(String[] args) {
        Card card = CardFactory.createCard();

        card.putMoney(5);
        System.out.println(card.amountOnAccount());

        card.putMoney(20);
        System.out.println(card.amountOnAccount());

        card.putMoney(500);
        System.out.println(card.amountOnAccount());
    }
}
