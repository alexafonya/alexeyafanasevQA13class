package com.tr.selenium.tests;

import com.tr.selenium.modul.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void groupCreationTest() {
        app.goToGroupsPage();
        int before = app.getGroupCount();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData()
                .withGroupName("test3")
                //.withGroupHeader("test3Header")
                .withGroupFooter("test3Footer"));
        app.submitGroupCreation();
        app.returnToGroupsPage();
        int after = app.getGroupCount();
        Assert.assertEquals(after, before+1);

    }

}
