package design.patterns.java.snemmani.structural.facade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class JdbcFacadeTest {
    JdbcFacade facade = new JdbcFacade();

    @Test
    public void test() {
        assertTrue(facade.createTable() == 0);
        assertTrue(facade.insertIntoTable() == 2);
    }
}
