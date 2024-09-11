package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.questions.ValidateElementsTextBtn;
import co.com.screenplay.project.tasks.ChooseSubElementsRandomTask;
import co.com.screenplay.project.tasks.FuntionsElementsTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.project.utils.Constants.ACTOR;
import static co.com.screenplay.project.utils.Constants.REMEMBER_TEXT_BTN_SUB_ELEMENTS;
import static co.com.screenplay.project.utils.DataFaker.fakerNumberOneAndNine;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@Slf4j
public class OpenWebStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} opens the test website")
    public void opensTheTestWebsite(String actorName) {
        OnStage.theActorCalled(actorName).attemptsTo(
        );
    }

    @And("he wants to validate the elements card function")
    public void wantValidateTheFunctionOfTheElementChart() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                FuntionsElementsTask.choose()
        );
    }

    @When("he randomly selects one of the sub-functions")
    public void randomlySelectsSomeOfTheSubfunctions() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                ChooseSubElementsRandomTask.witchParams(fakerNumberOneAndNine())
        );
    }

    @Then("he should see the name of the selected option in the header")
    public void willDisplayInTheHeaderTheNameOfTheChosenOption() {
        String validateText = OnStage.theActor(ACTOR).recall(REMEMBER_TEXT_BTN_SUB_ELEMENTS);
        if (validateText != null) {
            log.info(validateText);
        }
        theActorInTheSpotlight().should(seeThat(
                ValidateElementsTextBtn.witchParams(validateText))
        );
    }
}
