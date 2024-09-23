package co.com.screenplay.project.questions;

import co.com.screenplay.project.ui.DemoBlazeHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.ui.DemoBlazeHomePage.LIST_LAPTOPS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductListVisible implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(DemoBlazeHomePage.CATEGORY_LAPTOPS, isVisible()).forNoMoreThan(10).seconds()
        );
        return DemoBlazeHomePage.CATEGORY_LAPTOPS.resolveFor(actor).isVisible();
    }

    public static ProductListVisible isDisplayed() {
        return new ProductListVisible();
    }
}
