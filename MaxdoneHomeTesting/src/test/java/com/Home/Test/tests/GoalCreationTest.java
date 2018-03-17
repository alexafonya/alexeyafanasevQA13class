package com.Home.Test.tests;

import com.Home.Test.modul.Goal;
import org.testng.annotations.Test;

public class GoalCreationTest extends TestBase{

    @Test
    public void creationGoalTest(){
        app.goToGoalsPage();
        app.goalButton();
        app.goalTitle(new Goal("Go to Amsterdam"));
        app.choosingDate("15/06/2018", "02/06/2018");
        app.closeGoal();

    }
}
