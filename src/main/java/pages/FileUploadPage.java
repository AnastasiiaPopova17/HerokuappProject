package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class FileUploadPage extends BasePage{
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='file-upload']")
    WebElement btnChooseFile;

    @FindBy(xpath = "//input[@id='file-submit']")
    WebElement btnUpload;

    public FileUploadPage clickToUploadFile(String path) {
        btnChooseFile.sendKeys(path);
        clickBase(btnUpload);
        return this;
    }
}
