package com.tr.selenium.appManager;

import com.tr.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper(FirefoxDriver wd) {
       super(wd);
    }


        public void fillContactForm(ContactData contactData1) {
            type(By.name("firstname"), contactData1.getFirstName());
            type(By.name("lastname"), contactData1.getLastName());
            type(By.name("address"), contactData1.getAddress());
        }

    public void submitContactCreation() {
        click(By.name("submit"));
    }
}

