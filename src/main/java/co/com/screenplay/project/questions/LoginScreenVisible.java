package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.screenplay.project.ui.TalanaHomePage.USERNAME_FIELD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginScreenVisible implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return USERNAME_FIELD.resolveFor(actor).isVisible();
    }

    public static LoginScreenVisible isDisplayed() {
        return new LoginScreenVisible();
    }
}
