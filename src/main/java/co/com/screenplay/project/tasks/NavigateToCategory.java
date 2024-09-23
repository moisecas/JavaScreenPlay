package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.ui.DemoBlazeHomePage.CATEGORY_LAPTOPS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateToCategory implements Task {
    @Override
    @Step("selects the Laptops category")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CATEGORY_LAPTOPS, isVisible()).forNoMoreThan(10).seconds(),  // Espera explícita
                Click.on(CATEGORY_LAPTOPS)
        );
    }

    public static NavigateToCategory laptops() {
        return new NavigateToCategory();
    }

}
