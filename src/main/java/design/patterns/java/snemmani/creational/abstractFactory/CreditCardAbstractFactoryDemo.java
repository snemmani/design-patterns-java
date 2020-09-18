package design.patterns.java.snemmani.creational.abstractFactory;

public class CreditCardAbstractFactoryDemo {
    public static void main(String[] args) {
        CreditCardFactory cardFactory1 = CreditCardFactory.getCreditCardFactory(700);
        CreditCardFactory cardFactory2 = CreditCardFactory.getCreditCardFactory(200);

        System.out.println(cardFactory1.getCreditCard(CardType.GOLD));
        System.out.println(cardFactory1.getCreditCard(CardType.PLATINUM));

        System.out.println(cardFactory2.getCreditCard(CardType.GOLD));
        System.out.println(cardFactory2.getCreditCard(CardType.PLATINUM));

        System.out.println(cardFactory1);
        System.out.println(cardFactory2);
    }
}
