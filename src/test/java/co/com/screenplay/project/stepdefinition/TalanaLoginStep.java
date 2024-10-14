package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.questions.LoginScreenVisible;
import co.com.screenplay.project.tasks.NavigateToLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TalanaLoginStep {

    @Given("{string} opens the main page of Talana Pe")
    public void opensMainPage(String actorName) {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(actorName).attemptsTo(
                Open.url("https://qa-remuperu.talana.dev/es-pe/")  // Navega a la URL específica
        );
    }

    @When("he selects the login button")
    public void selectsLoginButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NavigateToLogin.login()
        );
    }

    @Then("he should see the login screen with the username field available")
    public void shouldSeeLoginScreen() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(LoginScreenVisible.isDisplayed())
        );
    }
}

