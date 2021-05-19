package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABTestingPage extends BasePage {

    By description = By.xpath("//p");

    ABTestingPage(WebDriver driver) {
        super(driver);
    }

    public String retrieveDescription() {
       return driver.findElement(description).getText();
    }
}
