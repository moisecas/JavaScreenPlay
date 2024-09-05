package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.targets.Target;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static co.com.screenplay.project.ui.CategoryUI.*;


public class ChooseCategory implements Task { //define la clase que implementa la interfaz task
    //representa una acción que un actor hará en la prueba

    // Lista de categorías disponibles
    private static final List<Target> CATEGORIES = Arrays.asList(
            CATEGORY_PHONES,
            CATEGORY_LAPTOPS,
            CATEGORY_MONITORS
    );

    @Override
    @Step("{0} selecciona una categoría de forma aleatoria") //el 0 se reemplazara x el nombre del actor en el momento de la prueba
    public <T extends Actor> void performAs(T actor) {

        // Seleccionar una categoría aleatoria de la lista
        Target randomCategory = CATEGORIES.get(ThreadLocalRandom.current().nextInt(CATEGORIES.size()));

        actor.attemptsTo( //acción del actor
                Click.on(randomCategory)  // Selecciona la categoría aleatoria
        );
    }

    public static ChooseCategory dynamic() {
        return Tasks.instrumented(ChooseCategory.class); //asegura que la tarea sea creada con los parametros necesarios
    }


}
