package com.telRan.cource.tests;

import org.testng.annotations.Test;

public class LoginTrelloTest extends TestBase {

    @Test
    public void TrelloLoginTest() {

        app.logIn("elena.telran@yahoo.com", "12345.com");
        app.logOut();
    }



    @Test
    public void LoginTrelloTestNotValidMail() {
        app.logIn("1", "12345.com");
    }

    @Test
    public void LoginTrelloEmptyFieldsTest() {
        app.logIn("", "");
    }

}
