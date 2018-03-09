package com.tr.selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{


    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void initContactCreation() {
        click(By.xpath("//*[@href='edit.php']"));
    }
}
