package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.ui.HomeUI.ID_HOME;
import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FuntionsElementsTask implements Task {
    @Override
    @Step("{0} selección la ID card ELEMENTS")
    public <T extends Actor> void performAs(T actor) {

        // Espera en segundos antes de iniciar la validación
        actor.attemptsTo(
                Scroll.to(ID_HOME),
                WaitUntil.the(ID_HOME, isVisible())
                        .forNoMoreThan(20).seconds()
        );

        actor.attemptsTo(Scroll.to(ID_HOME));
        actor.attemptsTo(WaitUntil.the(ID_HOME, isEnabled())
                        .forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(ID_HOME));
    }

    public static FuntionsElementsTask choose() {
        return Tasks.instrumented(FuntionsElementsTask.class);
    }
}