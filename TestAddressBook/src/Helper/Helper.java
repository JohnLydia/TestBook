package Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {



    public WebDriver initBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public void launchURL(WebDriver driver, String url) {
        System.out.println("Launching the URL " + url);
        driver.get(url);
    }

    public void presenceOfElement(WebDriver driver, By locator)
    {
        System.out.println(locator+" checking presences");
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public void clickButton(WebDriver browser,By locator)
    {
        presenceOfElement(browser,locator);
        WebElement element= browser.findElement(locator);
        element.click();
    }
    public void EnterText(WebDriver driver,By locator, String textToEnter) {
        presenceOfElement(driver, locator);
        WebElement element = driver.findElement(locator);
        element.sendKeys(textToEnter);
    }


        public void close(WebDriver driver){
            driver.close();
        }

    }
