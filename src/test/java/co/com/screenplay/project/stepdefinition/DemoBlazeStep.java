package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.questions.ProductListVisible;
import co.com.screenplay.project.tasks.NavigateToCategory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DemoBlazeStep {
    @Given("{string} opens the main page of DemoBlaze")
    public void opensTheDemoBlazeHomepage(String actorName) {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(actorName);
    }

    @When("he selects the {string} category")
    public void heSelectsTheCategory(String category) {
        // Here you can extend the logic to handle different categories
        OnStage.theActorInTheSpotlight().attemptsTo(
                NavigateToCategory.laptops()  // Adjust this to handle dynamic categories
        );
    }

    @Then("he should see the list of laptops on the page")
    public void heShouldSeeTheListOfLaptops() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ProductListVisible.isDisplayed())
        );
    }
}
