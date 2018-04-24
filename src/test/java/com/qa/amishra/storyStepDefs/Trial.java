package com.qa.amishra.storyStepDefs;

import com.qa.amishra.steps.TrialSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

public class Trial {

    @Steps
    TrialSteps trialSteps;

    @Given("a system state")
    public void givenASystemState() {

        trialSteps.some();

    }

    @When("I do something")
    public void whenIDoSomething() {

    }

    @Then("system is in a different state")
    public void thenSystemIsInADifferentState() {

    }
}
