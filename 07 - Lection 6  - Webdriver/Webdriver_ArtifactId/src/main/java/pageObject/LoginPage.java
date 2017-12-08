package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebElement loginField;

    public LoginPage(WebDriver webDriverFf) {
        webDriverFf.get("https://www.onliner.by/");
    }
}

//        loginPageLoginField = webDriverFf.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[1]/input"));