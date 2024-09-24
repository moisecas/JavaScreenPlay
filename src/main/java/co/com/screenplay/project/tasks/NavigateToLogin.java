package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import static co.com.screenplay.project.ui.TalanaHomePage.LOGIN_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateToLogin implements Task {
    @Override
    @Step("{0} selects the login button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOGIN_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LOGIN_BUTTON)
        );
    }

    public static NavigateToLogin login() {
        return new NavigateToLogin();
    }
}