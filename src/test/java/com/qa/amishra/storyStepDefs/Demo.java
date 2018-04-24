package com.qa.amishra.storyStepDefs;

import com.qa.amishra.steps.DemoSteps;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.assertj.core.api.Assertions.*;

public class Demo {


    @Steps
    DemoSteps endUser;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {

        assertThat(endUser.myMethod()).isEqualTo(5);

    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.dropTab();
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
       endUser.myMethod();
    }

}
