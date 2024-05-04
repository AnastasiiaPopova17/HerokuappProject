package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage{
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='column-a']")
    WebElement dragElement;

    @FindBy(xpath = "//div[@id='column-b']")
    WebElement dropElement;

    public DragAndDropPage actionsDragMe() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dropElement, dragElement).perform();
        return this;
    }






}

