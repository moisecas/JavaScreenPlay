package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.ui.DemoBlazeHomePage.CATEGORY_LAPTOPS;

public class NavigateToCategory implements Task {
    @Override
    @Step("{0} selects the Laptops category")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CATEGORY_LAPTOPS));
    }

    public static NavigateToCategory laptops() {
        return new NavigateToCategory();
    }

}
