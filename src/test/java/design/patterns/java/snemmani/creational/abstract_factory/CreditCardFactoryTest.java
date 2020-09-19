package design.patterns.java.snemmani.creational.abstract_factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CreditCardFactoryTest {
    @Test
    public void cardFactoryTest() {
        CreditCardFactory creditCardFactory1 = CreditCardFactory.getCreditCardFactory(200);
        CreditCardFactory creditCardFactory2 = CreditCardFactory.getCreditCardFactory(900);

        CreditCard card1 = creditCardFactory1.getCreditCard(CardType.GOLD);
        CreditCard card2 = creditCardFactory1.getCreditCard(CardType.PLATINUM);
        CreditCard card3 = creditCardFactory2.getCreditCard(CardType.GOLD);
        CreditCard card4 = creditCardFactory2.getCreditCard(CardType.PLATINUM);

        Validator validator1 = creditCardFactory1.getValidator(CardType.GOLD);
        Validator validator2 = creditCardFactory1.getValidator(CardType.PLATINUM);
        Validator validator3 = creditCardFactory2.getValidator(CardType.GOLD);
        Validator validator4 = creditCardFactory2.getValidator(CardType.PLATINUM);

        assertTrue(card1 instanceof VisaGoldCreditCard);
        assertTrue(card2 instanceof VisaBlackCreditCard);
        assertTrue(card3 instanceof AmexGoldCreditCard);
        assertTrue(card4 instanceof AmexPlatinumCreditCard);

        card1.setCardNumberLength(20);
        card1.setCvcNumber(222);

        assertTrue(card1.getCardNumberLength() == 20);
        assertTrue(card1.getCvcNumber() == 222);
    }
}
