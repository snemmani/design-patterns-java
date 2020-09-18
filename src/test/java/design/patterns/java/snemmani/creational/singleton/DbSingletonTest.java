package design.patterns.java.snemmani.creational.singleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class DbSingletonTest {
    @Test
    public void getInstance() {
        DbSingleton instance1 = DbSingleton.getInstance();
        DbSingleton instance2 = DbSingleton.getInstance();
        assertTrue(instance1 == instance2);
    }
}
