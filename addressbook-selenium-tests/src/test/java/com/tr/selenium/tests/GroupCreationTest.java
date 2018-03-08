package com.tr.selenium.tests;

import com.tr.selenium.modul.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void groupCreationTest() {
        app.goToGroupsPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "test1Header", "test1Footer"));
        app.submitGroupCreation();
        app.returnToGroupsPage();
    }

}
