/*
Написать тест который логинится на onliner.by  или любой другой интернет магазин
Выбирает рандомный продукт
Кладет в корзину
Заходит в корзину и проверяет наличие выбранного товара
Использовать все виды локаторов : id, name, class, xpath, css
*/

package org.openqa.selenium.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Selenium {
    @BeforeClass
    public void beforeClass() {
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "c:\\Users\\denisan\\IdeaProjects\\Webdriver_ArtifactId\\geckodriver.exe");
        WebDriver webDriverFf = new FirefoxDriver(); // Create a new instance of the Firefox driver
        webDriverFf.get("https://www.onliner.by/");
        WebElement enterButton = webDriverFf.findElement(By.xpath("/html/body/div[1]/div/div[2]/header/div[2]/div/div[2]/div[2]/div/div[1]"));
//                WebElement enterButton = webDriverFf.findElement(By.cssSelector(".auth-bar__item auth-bar__item--text"));
        System.out.println("!!!!!!!!!!!!!!!!!" + enterButton);
        enterButton.click();
        //LOGINPAGE
        WebElement loginPageLoginField = webDriverFf.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[1]/input"));
        loginPageLoginField.sendKeys("123");

//        try {
//            driver.wait(5000);
//            WebElement enterButton = driver.findElement(By.cssSelector("auth-bar__item auth-bar__item--text"));
//            enterButton.click();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


//
//        // Enter something to search for
//        element.sendKeys("Cheese!");
//
//        // Now submit the form. WebDriver will find the form for us from the element
//        element.submit();
//
//        // Check the title of the page
//        System.out.println("Page title is: " + driver.getTitle());
//
//        // Google's search is rendered dynamically with JavaScript.
//        // Wait for the page to load, timeout after 10 seconds
//        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//                return d.getTitle().toLowerCase().startsWith("cheese!");
//            }
//        });

//        // Should see: "cheese! - Google Search"
//        System.out.println("Page title is: " + driver.getTitle());
        webDriverFf.quit(); //Close the browser
    }
}