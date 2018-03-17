package com.Home.Test.appManager;

import com.Home.Test.modul.Task;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void start() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openSite("https://maxdone.micromiles.co/services/login");
        logIn("alex.afonya.84@gmail.com", "2e3r4t5y");
    }

    public void closeTask() {
        wd.findElement(By.id("hidePreview")).click();
    }

    public void submitTaskCreation() {
        wd.findElement(By.id("addTaskButton")).click();
    }

    public void fillTaskForm(Task task) {
        wd.findElement(By.id("taskInput")).click();
        wd.findElement(By.id("taskInput")).clear();
        wd.findElement(By.id("taskInput")).sendKeys(task.getTaskName());
    }

    public void goToTaskMenu() {
        wd.findElement(By.cssSelector("div.mainMenuIcon.tasksMenuIcon")).click();
    }

    public void logIn(String user, String pwd) {
        wd.findElement(By.id("username")).click();
        wd.findElement(By.id("username")).clear();
        wd.findElement(By.id("username")).sendKeys(user);
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(pwd);
        if (wd.findElement(By.name("_spring_security_remember_me")).isSelected()) {
            wd.findElement(By.name("_spring_security_remember_me")).click();
        }
        wd.findElement(By.id("loginButton")).click();
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public void stop() {
        wd.quit();
    }
}
