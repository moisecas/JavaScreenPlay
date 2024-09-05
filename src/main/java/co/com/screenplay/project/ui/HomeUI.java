package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI extends PageObject {

    public static final Target ID_HOME = Target.the("Boton home")
            .located(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));


    public static final Target BTN_ELEMENTS= Target.the("Boton contact")
            .located(By.xpath("//a[normalize-space()='Contact']"));

    /* Este elemento BTN_LIST_ELEMENTS se deja parametrizado **/
    public static final Target BTN_LIST_ELEMENTS = Target.the("boton lista opciones elementos")
            .locatedBy("//div[@id='contcont']//a[2]");

    public static final Target TXT_RANDOM_NAME_BTN= Target.the("Phones")
            .located(By.xpath("//a[3]"));
}
