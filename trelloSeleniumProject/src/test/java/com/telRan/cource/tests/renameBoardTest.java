package com.telRan.cource.tests;

import com.telRan.cource.model.BoardData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class renameBoardTest extends TestBase{

    @BeforeClass
    public void precondition(){
    app.logIn("elena.telran@yahoo.com","12345.com");

    }

    @Test
     public void testRenameBoard(){
        app.selectBoard();
        app.clickOnTheBoardTitle();
        app.fillRenameBoardTitle(new BoardData("Renamed"));
        app.clickRenameBoardButton();
        app.returnToHomePage();

     }

}
