package com.tr.selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase{
    private FirefoxDriver wd;

    public SessionHelper(FirefoxDriver wd) {
        super(wd);
        this.wd = wd;
    }

    public void logIn(String user, String pwd) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(user);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(pwd);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }
}
