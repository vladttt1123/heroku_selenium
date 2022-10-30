package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.AssertJUnit.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void setSlideToWholeNumber(){
        String value = "4";
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliders();
        horizontalSliderPage.setSliderValue(value);
        assertEquals(horizontalSliderPage.getSliderValue(), value);
    }

}
