package com.telRan.cource.application;

import com.telRan.cource.model.BoardData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openSite();
    }

    public void stop() {
        wd.quit();
    }

    public void confirmLogInButton() {
        wd.findElement(By.id("login")).click();
    }

    public void enterPassword(String pwd) {
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(pwd);
    }

    public void enterUserName(String userName) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
    }

    public void clickLoginButton() {
        wd.findElement(By.linkText("Log In")).click();
    }

    public void openSite() {
        wd.get("https://trello.com/");
    }

    public void logIn(String userName, String pwd){
       clickLoginButton();
       enterUserName(userName);
       enterPassword(pwd);
       confirmLogInButton();

   }

    public void returnToHomePage() {
        wd.findElement(By.cssSelector("span.header-logo-default")).click();
    }

    public void clickRenameBoardButton() {
        wd.findElement(By.cssSelector("input.primary.wide.js-rename-board")).click();
    }

    public void fillRenameBoardTitle(BoardData boardData) {
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).click();
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).clear();
        wd.findElement(By.cssSelector("input.js-board-name.js-autofocus")).sendKeys(boardData.getName());
    }

    public void clickOnTheBoardTitle() {
        wd.findElement(By.cssSelector("a.board-header-btn.board-header-btn-name")).click();
    }

    public void selectBoard() {
        wd.findElement(By.cssSelector("span[title=alex]"));
    }

    public void logOut() {

        wd.findElement(By.cssSelector("span.member-initials")).click();
        wd.findElement(By.cssSelector("a.js-logout")).click();

    }
}
