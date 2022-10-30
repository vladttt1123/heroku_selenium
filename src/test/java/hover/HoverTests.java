package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
       HoversPage hoverPage =  homePage.clickHovers();
       var caption =  hoverPage.hoverOverFigure(1);
       assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
       assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
       assertEquals(caption.getLinkText(), "View Profile", "Caption link is incorrect");
       assertTrue(caption.getLink().endsWith("/users/1"), "Link Incorrect");

    }
}
