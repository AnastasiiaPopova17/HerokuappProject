package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WindowsPage extends BasePage{
    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Click Here']")
    WebElement btnClickHere;


    public WindowsPage openNewWindowPage() {
        clickBase(btnClickHere);
        return this;
    }

    public NewWindowPage switchToNewWindowPage(int index) {
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return new NewWindowPage(driver);
    }


}
