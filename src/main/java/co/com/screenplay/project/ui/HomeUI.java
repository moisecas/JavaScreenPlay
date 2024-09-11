package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI extends PageObject {

    public static final Target ID_HOME = Target.the("Boton home")
            .located(By.cssSelector("li[class='nav-item active'] a[class='nav-link']"));


    public static final Target BTN_ELEMENTS= Target.the("Boton contacto")
            .located(By.xpath("//a[normalize-space()='Contact']"));


    public static final Target BTN_LIST_ELEMENTS = Target.the("header categories")
            .locatedBy("//a[@id='cat']");

    public static final Target TXT_RANDOM_NAME_BTN= Target.the("Phone front samsung")
            .located(By.xpath("//a[normalize-space()='Samsung galaxy s6']"));
}
