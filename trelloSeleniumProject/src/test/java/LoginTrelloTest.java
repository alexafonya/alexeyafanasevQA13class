import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class LoginTrelloTest extends TestBase {

    @Test
    public void TrelloLoginTest() {

        clickLoginButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        logIn();
        logOut();
    }

    private void logOut() {

     wd.findElement(By.cssSelector("span.member-initials")).click();
     wd.findElement(By.cssSelector("a.js-logout")).click();

    }

    @Test
    public void LoginTrelloTestNotValidMail() {
        clickLoginButton();
        enterUserName("1");
        enterPassword("12345.com");
        logIn();
    }

    @Test
    public void LoginTrelloEmptyFieldsTest() {
        clickLoginButton();
        enterUserName("");
        enterPassword("");
        logIn();
    }

}
