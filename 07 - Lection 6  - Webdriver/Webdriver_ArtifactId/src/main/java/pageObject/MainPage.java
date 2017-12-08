package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainPage {

    private WebElement loginPageEnterButton;

    public MainPage(WebDriver webDriverFf) throws InterruptedException {
        webDriverFf.get("https://www.onliner.by/");
        loginPageEnterButton = webDriverFf.findElement(By.cssSelector(".auth-bar__item--text"));
    }

    public WebElement getLoginPageEnterButton() {
        return loginPageEnterButton;
    }
}
