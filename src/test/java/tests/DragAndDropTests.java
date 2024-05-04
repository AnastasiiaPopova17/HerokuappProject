package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DragAndDropPage;
import pages.HomePage;

public class DragAndDropTests extends BaseTest{

    @BeforeClass
    public void precondition() {
        new HomePage(driver).clickToDragAndDrop();
    }

    @AfterClass
    public void postCondition() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void dragAndDropActions() {
        new DragAndDropPage(driver).actionsDragMe();
    }
}
