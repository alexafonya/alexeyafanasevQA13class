package com.Home.Test.tests;

import com.Home.Test.modul.Goal;
import org.testng.annotations.Test;

public class GoalTaskCreationTest extends TestBase{

    @Test
    public void creationGoalTask(){
        app.goToGoalsPage();
        app.ButtonSetGoal();
        app.goalTitle(new Goal("Go to Amsterdam"));
        app.choosingDate("15/08/2018","25/07/2018");
        app.fillTaskInGoal("Preparations for a trip");
        app.submitTaskCreation();

    }
}
