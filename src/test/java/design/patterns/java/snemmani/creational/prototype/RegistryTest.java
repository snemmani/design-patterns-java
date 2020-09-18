package design.patterns.java.snemmani.creational.prototype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class RegistryTest {

    @Test
    public void createItem() {
        Registry registry = new Registry();
        Movie movie1 = (Movie) registry.createItem("Movie");
        Movie movie2 = (Movie) registry.createItem("Movie");
        assertTrue(movie1.getTitle().equals(movie2.getTitle()));
        assertTrue(movie1.getPrice() == movie2.getPrice());
        assertTrue(movie1.getUrl() == movie2.getUrl());
        assertTrue(movie1.getRuntime().equals(movie2.getRuntime()));
        assertTrue(movie1.getTitle().equals(movie2.getTitle()));
        assertTrue(movie1 != movie2);
        Item book1 = registry.createItem("Book");
        Item book2 = registry.createItem("Book");
        assertTrue(book1.getTitle().equals(book2.getTitle()));
        assertTrue(book1 != book2);
        assertTrue(book1 instanceof Book);
        assertTrue(book1 instanceof Item);

    }
}
