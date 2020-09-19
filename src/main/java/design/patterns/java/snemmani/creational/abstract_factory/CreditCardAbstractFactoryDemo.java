package design.patterns.java.snemmani.creational.abstract_factory;

public class CreditCardAbstractFactoryDemo {
    public static void main(String[] args) {
        CreditCardFactory cardFactory1 = CreditCardFactory.getCreditCardFactory(700);
        CreditCardFactory cardFactory2 = CreditCardFactory.getCreditCardFactory(200);
    }
}
