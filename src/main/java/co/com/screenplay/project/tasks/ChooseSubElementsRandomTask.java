package co.com.screenplay.project.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.ui.HomeUI.BTN_ELEMENTS;
import static co.com.screenplay.project.ui.HomeUI.BTN_LIST_ELEMENTS;
import static co.com.screenplay.project.utils.Constants.REMEMBER_TEXT_BTN_SUB_ELEMENTS;

@AllArgsConstructor
public class ChooseSubElementsRandomTask implements Task {

    private String numberRamdonBtn;

    public static ChooseSubElementsRandomTask withParams(String numberRamdonBtn) {
        return Tasks.instrumented(ChooseSubElementsRandomTask.class, numberRamdonBtn);
    }


    @Override
    @Step("{0} selecciona la opción de sub-elementos en la posición indicada")
    public <T extends Actor> void performAs(T actor) {
        // Hacer scroll hasta el botón de "Contact" y hacer clic en él
        actor.attemptsTo(
                Scroll.to(BTN_ELEMENTS),
                Click.on(BTN_ELEMENTS) // Hacer clic en el botón "Contact"
        );

        // Luego de hacer clic en el botón, seleccionar un elemento de la lista
        String textBtn = BTN_LIST_ELEMENTS.of(numberRamdonBtn).resolveFor(actor).getText();
        actor.remember(REMEMBER_TEXT_BTN_SUB_ELEMENTS, textBtn);

        // Seleccionar el sub-elemento basado en el número aleatorio proporcionado
        actor.attemptsTo(
                Click.on(BTN_LIST_ELEMENTS.of(numberRamdonBtn))
        );
    }
}