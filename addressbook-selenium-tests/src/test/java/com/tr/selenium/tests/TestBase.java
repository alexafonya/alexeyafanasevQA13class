package com.tr.selenium.tests;

import com.tr.selenium.appManager.ApplicationManagar;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final ApplicationManagar app = new ApplicationManagar();

    @BeforeClass
    public void setUp() throws Exception {
        app.start();
    }


    @AfterClass
    public void tearDown() {
        app.stop();
    }


}
