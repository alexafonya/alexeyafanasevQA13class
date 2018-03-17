package com.Home.Test.appManager;

import com.Home.Test.modul.Goal;
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
        logIn("alex.afonya.84@gmail.com", "12345.com");
    }

    public void stop() {
        wd.quit();
    }

    public void logIn(String user, String pwd) {
        type(By.id("username"), user);
        type(By.id("password"), pwd);
        if (wd.findElement(By.name("_spring_security_remember_me")).isSelected()) {
            click(By.name("_spring_security_remember_me"));
        }
        click(By.id("loginButton"));
    }

    public void choosingDate(String endData, String startData){
        typeData(By.id("endPeriod"), By.id("endPeriodLink"), endData);
        typeData(By.id("startPeriod"), By.id("startPeriodLink"), startData);

    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void typeData(By locator, By locatorD, String textData) {
        click(locator);
        wd.findElement((locator)).clear();
        click(locatorD);
        wd.findElement((locator)).sendKeys(textData);
    }

    public void closeTask() {
        click(By.id("hidePreview"));
    }

    public void submitTaskCreation() {
        click(By.id("addTaskButton"));
    }

    public void fillTaskForm(Task task) {
        type(By.id("taskInput"), task.getTaskName());
    }

    public void goToTaskMenu() {
        click(By.cssSelector("div.mainMenuIcon.tasksMenuIcon"));
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public void goToGoalsPage() {
        click(By.cssSelector("li.goals"));
    }

    public void goalButton() {
        click(By.id("createGoal"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void goalTitle(Goal goal) {
        type(By.id("goalTitle"), goal.getGoalName());
    }

    public void closeGoal() {
        click(By.id("closeForm"));
    }
}
