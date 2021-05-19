package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;

    private BasePage() {
        throw new RuntimeException("Please initialize base page using constructor with driver");
    }

    BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
