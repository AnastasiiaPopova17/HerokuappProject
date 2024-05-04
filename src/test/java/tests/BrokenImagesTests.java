package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BrokenImagesPage;
import pages.HomePage;

public class BrokenImagesTests extends BaseTest{

    @BeforeClass
    public void precondition() {
        new HomePage(driver).clickToBrokenImages();
    }

    @AfterClass
    public void postCondition() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void brokenImagesTests() {
        new BrokenImagesPage(driver).checkBrokenImage();
    }
}
