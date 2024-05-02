package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CheckboxesPage;
import pages.HomePage;

public class CheckboxesTests extends BaseTest{

    @BeforeClass
    public void precondition() {
        new HomePage(driver).clickOnCheckboxes();
    }

    @Test
    public void checkboxesSelect() {
        Assert.assertTrue(
                new CheckboxesPage(driver)
                        .fillCheckboxes()
                        .isInputInCheckboxes());
    }
}
