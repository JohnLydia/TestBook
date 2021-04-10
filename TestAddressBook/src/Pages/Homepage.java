package Pages;

import org.openqa.selenium.By;

public class Homepage {
    public By sign = By.xpath("//a[@id='sign-in']");
    public By username = By.xpath("//input[@class='form-control']");
    public By password = By.xpath("//input[@type='password']");
    public By login = By.xpath("//input[@type='submit']");
}
