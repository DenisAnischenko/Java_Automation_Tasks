/*
Написать тест который логинится на onliner.by  или любой другой интернет магазин
Выбирает рандомный продукт. Кладет в корзину.
Заходит в корзину и проверяет наличие выбранного товара
Использовать все виды локаторов : id, name, class, xpath, css
*/

package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import pageObject.LoginPage;
import pageObject.MainPage;


public class Selenium {
    private static WebDriver webDriverFf;

    @BeforeClass
    public void beforeClass() {
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "c:\\Users\\denisan\\IdeaProjects\\Webdriver_ArtifactId\\geckodriver.exe");
        webDriverFf = new FirefoxDriver();
        MainPage mainPage = new MainPage();
        mainPage.getLoginPageEnterButton().click();
        Thread.sleep(2000);
        mainPage.loginMethod("denisanischenko@gmail.com", "gbhfvblf1984");
        webDriverFf.get("https://catalog.onliner.by/mobile/apple/iphonex/prices?town=minsk");
        webDriverFf.findElement(By.cssSelector(".offers-list__button_basket")).click();
        webDriverFf.findElement(By.cssSelector("b-top-navigation-cart__link")).click();
    }

    public static WebDriver getWebDriverFf() {
        return webDriverFf;
    }

}


//Todo
// УБРАТЬ ВСЕ СЛИПЫ!!!
// Сделать аннотацию в TESTNG
// Относительный путь geckodriver.exe


//        element.submit(); Now submit the form. WebDriver will find the form for us from the element
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
//        webDriverFf.quit(); //Close the browser


//    Левчук Света
//    WebDriverWait wait = new WebDriverWait(driver, timeOut);
//        wait.until(new ExpectedCondition<Boolean>() {
//public Boolean apply(WebDriver driver) {
//        if (driver.findElement(By.id(webElementId)) != null){
//        return Boolean.TRUE;
//        }
//        return null;
//        }
//        });
//        что-то типа этого