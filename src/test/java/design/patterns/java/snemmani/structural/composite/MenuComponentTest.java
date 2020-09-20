package design.patterns.java.snemmani.structural.composite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.logging.Logger;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MenuComponentTest {
    private static final Logger LOGGER = Logger.getLogger(MenuComponentTest.class.getName());
    @Test
    public void test() {
        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety", "safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        MenuItem personalClaimsMenu = new MenuItem("Personal Claims", "/personalClaims");

        claimsSubMenu.add(personalClaimsMenu);

        mainMenu.add(claimsSubMenu);

        String stringRepresentation = mainMenu.toString();

        LOGGER.info(stringRepresentation);

        assertTrue(stringRepresentation.contains(claimsSubMenu.getName()));
        assertTrue(stringRepresentation.contains(personalClaimsMenu.getName()));
        assertTrue(stringRepresentation.contains(safetyMenuItem.getName()));
        assertTrue(stringRepresentation.contains(mainMenu.getUrl()));
    }

}
