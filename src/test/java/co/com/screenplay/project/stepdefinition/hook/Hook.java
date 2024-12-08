package co.com.screenplay.project.stepdefinition.hook;

import co.com.screenplay.project.hook.OpenWeb;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {

    private static final String WEB_URL_MAP = "https://opencart.abstracta.us/";

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());

        Actor actor = OnStage.theActorCalled("moiso");
        actor.attemptsTo(OpenWeb.browserURL(WEB_URL_MAP));
    }
}
