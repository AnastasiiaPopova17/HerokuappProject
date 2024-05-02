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

    @FindBy(xpath = "//a[text()='Multiple Windows']")
    WebElement btnMultipleWindow;

    @FindBy(xpath = "//a[text()='Checkboxes']")
    WebElement btnCheckboxes;

    public JavaScriptAlertsPage clickOnJavaScriptAlerts() {
        clickWithJSScroll(btnJavaScriptAlerts, -400, 600);
        return new JavaScriptAlertsPage(driver);
    }

    public WindowsPage clickOnOpenNewWindow() {
        clickWithJSScroll(btnMultipleWindow,-400, 500);
        return new WindowsPage(driver);
    }

    public CheckboxesPage clickOnCheckboxes() {
        clickBase(btnCheckboxes);
        return new CheckboxesPage(driver);
    }
}
