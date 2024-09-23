package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.screenplay.project.ui.DemoBlazeHomePage.LIST_LAPTOPS;

public class ProductListVisible implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(LIST_LAPTOPS).answeredBy(actor).booleanValue();
    }

    public static ProductListVisible isDisplayed() {
        return new ProductListVisible();
    }
}
