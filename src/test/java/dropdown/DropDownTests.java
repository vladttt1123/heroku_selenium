package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        DropdownPage dropDownPAge = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPAge.selectFromDropDown(option);
        var selectedOptions = dropDownPAge.getSelectedOption();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "option not selected");

    }
}
