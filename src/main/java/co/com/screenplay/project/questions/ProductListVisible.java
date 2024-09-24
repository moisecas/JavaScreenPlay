package co.com.screenplay.project.questions;

import co.com.screenplay.project.ui.DemoBlazeHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.screenplay.project.ui.DemoBlazeHomePage.PRODUCT_SONY_VAIO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductListVisible implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(PRODUCT_SONY_VAIO).answeredBy(actor).booleanValue();
    }

    public static ProductListVisible isDisplayed() {
        return new ProductListVisible();
    }
}
