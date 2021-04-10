package TestCases;

import Helper.Helper;
import Pages.Homepage;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Testcase extends Helper {

    static Testcase tc = new Testcase();
    static Homepage home= new Homepage();
    static Properties prop = new Properties();

    public static void main(String args[]) throws IOException {
        WebDriver browser=tc.initBrowser();
        tc.launchURL(browser,"http://a.testaddressbook.com/");
        tc.Test1(browser);
        tc.Test2(browser);
        tc.close(browser);
    }
    public void Test1(WebDriver browser)
    {
        tc.clickButton(browser,home.sign);;
        tc.presenceOfElement(browser,home.username);
        tc.presenceOfElement(browser,home.password);
        tc.clickButton(browser,home.login);


    }
    public void Test2(WebDriver browser) throws IOException {
        FileReader file = new FileReader("Logins");
        Properties prop = new Properties();
        prop.load(file);
        String Username = prop.get("Username").toString();
        String Password = prop.get("Password").toString();
        tc.clickButton(browser,home.sign);;
        tc.presenceOfElement(browser,home.username);
        tc.presenceOfElement(browser,home.password);
        tc.clickButton(browser,home.login);
        tc.EnterText(browser, home.username, Username);
        tc.EnterText(browser, home.password, Password);
    }
}

