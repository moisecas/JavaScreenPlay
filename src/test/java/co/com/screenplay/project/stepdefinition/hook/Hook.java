package co.com.screenplay.project.stepdefinition.hook;

import co.com.screenplay.project.hook.OpenWeb;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {

    private static final String WEB_URL_MAP = "https://www.demoblaze.com/";

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());

        Actor actor = OnStage.theActorCalled("Alejandro");
        actor.attemptsTo(OpenWeb.browserURL(WEB_URL_MAP));
    }
}
