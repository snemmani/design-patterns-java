package design.patterns.java.snemmani.creational.builder;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LunchOrderTest {
    @Test
    public void lunchOrderTest() {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        LunchOrder order = builder.bread("wheat").condiments("lettuce").dressing("mayo").meat("none").build();

        assertTrue(order.getBread().equals("wheat"));
        assertTrue(order.getCondiments().equals("lettuce"));
        assertTrue(order.getDressing().equals("mayo"));
        assertTrue(order.getMeat().equals("none"));
    }
}
