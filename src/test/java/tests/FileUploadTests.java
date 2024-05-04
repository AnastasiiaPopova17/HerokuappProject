package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import pages.HomePage;

public class FileUploadTests extends BaseTest{

    @BeforeClass
    public void precondition() {
        new HomePage(driver).clickOnFileUpload();
    }

    @AfterClass
    public void postCondition() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void uploadFile() {
        new FileUploadPage(driver).clickToUploadFile("C:\\Users\\AIT TR Student\\Documents\\QA with Kristina\\bug's images\\Снимок экрана 2024-04-22 084536.png");
    }
}
