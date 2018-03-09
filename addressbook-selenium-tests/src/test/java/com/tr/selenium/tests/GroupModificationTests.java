package com.tr.selenium.tests;

import com.tr.selenium.modul.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase{

    @Test
    public void modifyGroupTest(){
        app.goToGroupsPage();
        int before = app.getGroupCount();
        app.selectGroup();
        app.initGroupModification();
        app.fillGroupForm(new GroupData()
                .withGroupName("rename")
                .withGroupHeader("rename")
                .withGroupFooter("rename"));
        app.submitGroupModification();
        app.returnToGroupsPage();
        int after = app.getGroupCount();
        Assert.assertEquals(after,before);
    }
}
