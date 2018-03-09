package com.tr.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase{

    @Test

    public void deletionGroupTest(){
        app.goToGroupsPage();
        int before = app.getGroupCount();
        app.selectGroup();
        app.initGroupDeletion();
        app.returnToGroupsPage();
        int after = app.getGroupCount();
        Assert.assertEquals(after+1,before);
    }

}
