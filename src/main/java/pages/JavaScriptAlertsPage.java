package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertsPage extends BasePage{
    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    WebElement btnJSAlert;

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    WebElement btnJSConfirm;

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    WebElement btnJSPromt;

    @FindBy(xpath = "//p[@id='result']")
    WebElement textFromPromt;

    private Alert getAlert() {
        return driver.switchTo().alert();
    }

    public JavaScriptAlertsPage clickAccept(Alert alert) {
        alert.accept();
        return this;
    }

    public JavaScriptAlertsPage clickDismiss(Alert alert) {
        alert.dismiss();
        return this;
    }

    private void typeAlertInPromt(String text, Alert alert) {
        alert.sendKeys(text);
    }
     private String getMessageAlert(Alert alert) {
        return alert.getText().trim();
     }

    public JavaScriptAlertsPage closeAlertIfPresent() {
        try {
            clickAccept(getAlert());
        }catch (Exception e) {
            logger.info("alert not displays");
        }
        return this;
    }

    public boolean verifyJSAlertOpen() {
        clickBase(btnJSAlert);
        pause(5200);
        Alert alert = getAlert();
        String expectedRes = "I am a JS Alert";
        String actualRes = getMessageAlert(alert);
        clickAccept(alert);
        return expectedRes.equals(actualRes);
    }

    public boolean verifyJSConfirmOpen() {
        clickBase(btnJSConfirm);
        Alert alert = getAlert();
        String expectedRes = "I am a JS Confirm";
        String actualRes = getMessageAlert(alert);
        clickAccept(alert);
        return expectedRes.equals(actualRes);
    }

    public boolean verifyTextFromJSPromtOpen(String text) {
        clickBase(btnJSPromt);
        Alert alert = getAlert();
        typeAlertInPromt(text, alert);
        clickAccept(alert);
        String actualRes = getTextBase(textFromPromt);
        return actualRes.contains(text);
    }
}
