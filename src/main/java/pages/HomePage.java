package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    By abTesting = By.linkText("A/B Testing");

    private HomePage(WebDriver driver) {
        super(driver);
    }

    public static HomePage visitHomePage(WebDriver driver) {
        return new HomePage(driver).visit();
    }

    public ABTestingPage clickOnABTesting() {
        driver.findElement(abTesting).click();
        return new ABTestingPage(driver);
    }

    private HomePage visit() {
        driver.navigate().to("http://the-internet.herokuapp.com/");
        return this;
    }


}
