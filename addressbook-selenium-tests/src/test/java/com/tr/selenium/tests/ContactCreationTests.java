package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

    @Test

    public void creationContactTest(){
        app.getNavigationHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData()
                .setFirstName("fName")
                .setLastName("lName")
                .setAddress("address"));
        app.getContactHelper().submitContactCreation();

    }

}
