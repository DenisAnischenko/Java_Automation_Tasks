package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.example.Selenium;

public class LoginPage {

    private WebElement loginField;
    private WebElement passwordField;
    private WebElement submitButton;


    public LoginPage() {
        loginField = Selenium.getWebDriverFf().findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[1]/input"));
        passwordField = Selenium.getWebDriverFf().findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[2]/input"));
        submitButton = Selenium.getWebDriverFf().findElement(By.cssSelector(".auth__btn--green"));

    }

    public WebElement getLoginField() {
        return loginField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
}