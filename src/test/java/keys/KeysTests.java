package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.AssertJUnit.assertEquals;

public class KeysTests extends BaseTests {
    /**
     * In the test below I do the back space with the
     * help of Keys class amd method backspace.
     * In fact, Keys class provides us with many
     * useful methods to simulate keyboard input.
     */

    @Test
    public void testBackSpace(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();

    }
}
