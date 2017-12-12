package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.example.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainPage {
    private WebDriver _webDriverFf;
    private WebElement loginPageEnterButton;

    public MainPage() throws InterruptedException {
        _webDriverFf = Selenium.getWebDriverFf();
        _webDriverFf.get("https://www.onliner.by/");
        loginPageEnterButton = _webDriverFf.findElement(By.cssSelector(".auth-bar__item--text"));
    }

    public void loginMethod(String login, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.getLoginField().sendKeys(login);
        loginPage.getPasswordField().sendKeys(password);
        loginPage.getSubmitButton().click();
    }


    public WebElement getLoginPageEnterButton() {
        return loginPageEnterButton;
    }
}
