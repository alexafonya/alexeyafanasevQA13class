package com.tr.selenium.tests;

import com.tr.selenium.appManager.ApplicationManagar;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static ApplicationManagar app = new ApplicationManagar(System.getProperty("browser",BrowserType.CHROME));//);

    @BeforeSuite
    public void setUp() throws Exception {
        app.start();
    }


    @AfterSuite
    public void tearDown() {
        app.stop();
    }


}
