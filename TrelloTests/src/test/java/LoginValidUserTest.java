import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class LoginValidUserTest {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void validUserLoginTest() {
        openSite();
        clickLogInButton();
        openUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogInButton();
    }

    @Test
    public void validUserLoginTestNotValid() {
        openSite();
        clickLogInButton();
        openUserName("1");
        enterPassword("12345.com");
        confirmLogInButton();
    }

    @Test
    public void validUserLoginTestEmptyFilds() {
        openSite();
        clickLogInButton();
        openUserName("");
        enterPassword("");
        confirmLogInButton();
    }

    private void confirmLogInButton() {
        wd.findElement(By.id("login")).click();
    }

    private void enterPassword(String pwd) {
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(pwd);
    }

    private void openUserName(String userName) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
    }

    private void clickLogInButton() {
        wd.findElement(By.linkText("Log In")).click();
    }

    private void openSite() {
        wd.get("https://trello.com/");
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
