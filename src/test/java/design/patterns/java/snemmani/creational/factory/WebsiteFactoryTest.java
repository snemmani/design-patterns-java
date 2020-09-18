package design.patterns.java.snemmani.creational.factory;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class WebsiteFactoryTest {
    @Test
    public void testFactory() {
        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        blog.createWebsite();
        shop.createWebsite();

        blog.pages.stream().forEach(page -> assertTrue(page instanceof Page) );

        assertTrue(shop instanceof Shop);
        assertTrue(shop instanceof Website);

        assertTrue(blog instanceof Blog);
        assertTrue(blog instanceof Website);
    }
}
