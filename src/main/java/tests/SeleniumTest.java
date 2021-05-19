package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ABTestingPage;
import pages.HomePage;

public class SeleniumTest extends BaseSeleniumTest {

    @Test
    public void first_selenium_test() {
       String title = HomePage.visitHomePage(driver)
            .clickOnABTesting()
            .retrieveDescription();
        Assert.assertEquals(title, "Also known as split testing. This is a way in which businesses are able to simultaneously test and"
            + " learn different versions of a page to see which text and/or functionality works best towards a "
            + "desired outcome (e.g. a user action such as a click-through).");
    }
}
