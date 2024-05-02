package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class NewWindowPage extends BasePage{
    public NewWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3")
    WebElement textTitle;

    public boolean verifyNewWindowOpen() {
        String actualRes = getTextBase(textTitle);
        String expectedRes = "New Window";
        return isStringsEqual(actualRes, expectedRes);
    }

    public WindowsPage switchToWindowPage(int index) {
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return new WindowsPage(driver);
    }

    public NewWindowPage closeCurrentTab() {
        driver.close();
        return this;
    }
}
