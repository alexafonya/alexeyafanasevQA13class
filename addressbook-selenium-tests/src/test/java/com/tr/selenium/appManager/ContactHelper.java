package com.tr.selenium.appManager;

import com.tr.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper(FirefoxDriver wd) {
       super(wd);
    }


        public void fillContactForm(ContactData contactData1) {
            type(By.name("group_name"), contactData1.getFirstName());
            type(By.name("group_header"), contactData1.getLastName());
            type(By.name("group_footer"), contactData1.getAddress());
        }

    public void submitContactCreation() {
        click(By.name("submit"));
    }
}

