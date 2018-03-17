package com.Home.Test.tests;

import com.Home.Test.modul.Task;
import org.testng.annotations.Test;

public class TaskCreationTest extends TestBase {

    @Test
    public void creationTaskTest() {
        app.goToTaskMenu();
        app.fillTaskForm(new Task("Test 1"));
        app.submitTaskCreation();
        app.closeTask();
    }

}
