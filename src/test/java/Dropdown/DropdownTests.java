package Dropdown;

import Pages.DropdownPage;
import SeleniumChapter4BaseTest.BaseTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTest {
    @Test
    public void testSelectOption(){
        DropdownPage dropdownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropdownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropdownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selection");
        assertTrue(selectedOptions.contains(option),"Option not selected");
    }
}
