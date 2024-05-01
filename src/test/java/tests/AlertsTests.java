package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JavaScriptAlertsPage;

public class AlertsTests extends BaseTest{
    @BeforeClass
    public void classPreconditions() {
        new HomePage(driver).clickOnJavaScriptAlerts();
    }

    @AfterMethod
    public void preconditionAfterMethod() {
        new JavaScriptAlertsPage(driver).closeAlertIfPresent();

    }

    @Test
    public void jsAlertOpen()  {
        Assert.assertTrue(new JavaScriptAlertsPage(driver)
                .verifyJSAlertOpen());
    }

    @Test
    public void jsConfirmOpen() {
        Assert.assertTrue(new JavaScriptAlertsPage(driver)
                .verifyJSConfirmOpen());
    }

    @Test
    public void jsPromtOpen() {
        Assert.assertTrue(new JavaScriptAlertsPage(driver)
                .verifyTextFromJSPromtOpen("hello"));
    }
}
