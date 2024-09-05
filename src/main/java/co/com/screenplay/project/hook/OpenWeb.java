package co.com.screenplay.project.hook;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWeb implements Task {

    private final String webUrl;

    public OpenWeb(String webUrl) {
        this.webUrl = webUrl;
    }

    @Override
    @Step("abre el navegador web en la URL: #webUrl")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(webUrl));
    }

    public static Performable browserURL(String webUrl) {
        return instrumented(OpenWeb.class, webUrl);
    }
}
