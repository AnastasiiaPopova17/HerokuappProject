package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NewWindowPage;
import pages.WindowsPage;

public class WndowsTests extends BaseTest{
    @BeforeClass
    public void precondition() {
        new HomePage(driver).clickOnOpenNewWindow();
    }

    @AfterMethod
    public void afterMethodPostcondition() {
        new NewWindowPage(driver)
                .closeCurrentTab()
                .switchToWindowPage(0);
    }

    @Test
    public void isNewWindowOpen() {
        Assert.assertTrue(new WindowsPage(driver)
                        .openNewWindowPage()
                        .switchToNewWindowPage(1)
                        .verifyNewWindowOpen());
    }
}
