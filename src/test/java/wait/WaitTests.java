package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void waitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "loaded Text Incorrect");
    }
}
