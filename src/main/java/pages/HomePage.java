package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'JavaScript Alerts')]")
    WebElement btnJavaScriptAlerts;

    public JavaScriptAlertsPage clickOnJavaScriptAlerts() {
        clickWithJSScroll(btnJavaScriptAlerts, -400, 600);
        return new JavaScriptAlertsPage(driver);
    }
}
