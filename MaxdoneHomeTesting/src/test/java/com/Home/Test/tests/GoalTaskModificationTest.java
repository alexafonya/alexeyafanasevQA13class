package com.Home.Test.tests;

import com.Home.Test.modul.Goal;
import org.testng.annotations.Test;

public class GoalTaskModificationTest extends TestBase{

    @Test
    public void modificationGoalTaskTest(){
        app.goToGoalsPage();
        app.chooseGoal();
        app.goalTitle(new Goal("Next week's meeting"));
        app.chooseTask();
        app.renameTask();
    }
}
