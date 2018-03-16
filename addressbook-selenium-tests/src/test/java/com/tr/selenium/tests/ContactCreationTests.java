package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class ContactCreationTests extends TestBase{

    @Test
    public void creationContactTest(){
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getNavigationHelper().initContactCreation();
        File photo = new File("src/test/resources/cat.jpg");
        app.getContactHelper().fillContactForm(new ContactData()
                .setFirstName("fName")
                .setLastName("lName")
                .setAddress("address")
                .setGroup("test3").setPhoto(photo));
        app.getContactHelper().submitContactCreation();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before+1);

    }

}
