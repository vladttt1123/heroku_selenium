package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenu;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void checkAlertMessage(){
        ContextMenu contextMenu = homePage.clickContextMenu();
        contextMenu.rightClickArea();
        String text = contextMenu.getResult();
        contextMenu.clickOk();
        assertEquals(text, "You selected a context menu", "Message is not correct");

    }

}
