package pages;

import org.checkerframework.checker.calledmethods.qual.RequiresCalledMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckboxesPage extends BasePage{
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input")
    List<WebElement> inputCheckboxesElements;

    public CheckboxesPage fillCheckboxes() {
        for (WebElement el: inputCheckboxesElements){
            if (getTextBase(el).equals(inputCheckboxesElements)){
                clickBase(el);
                break;
            }
        }
        return this;
    }

    public boolean isInputInCheckboxes() {
        for (WebElement el: inputCheckboxesElements) {
            if (inputCheckboxesElements.equals("")){
                break;
            }else {
                clickBase(el);
            }
        }return true;
    }
}
