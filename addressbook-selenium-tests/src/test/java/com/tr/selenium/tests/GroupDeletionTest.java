package com.tr.selenium.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase{

    @Test

    public void deletionGroupTest(){

        app.goToGroupsPage();
        app.selectGroup();
        app.initGroupDeletion();
        app.returnToGroupsPage();

    }

}
