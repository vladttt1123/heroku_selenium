package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
        /**
         * This class was created to show how to naviage between different elements of the page

         */
        @Test
        public void testNavigator(){
                homePage.clickDynamicLoading().clickExample1();
                getWindowManager().goBack();
                getWindowManager().refreshPage();
                getWindowManager().goForward();
                getWindowManager().goTo("https://google.com");
        }

        }
