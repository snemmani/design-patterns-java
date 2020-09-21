package design.patterns.java.snemmani.structural.decorator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SandwichTest {
    @Test
    public void test() {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        assertTrue(sandwich.make().contains("mustard"));
        assertTrue(sandwich.make().contains("turkey"));
    }
}
