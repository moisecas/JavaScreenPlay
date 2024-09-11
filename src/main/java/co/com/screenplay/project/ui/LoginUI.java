package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI extends PageObject {



    public static final Target MODAL_LOGIN = Target.the("seleccionar login")
            .located(By.id("login2"));

    public static final Target INPUT_USER_NAME = Target.the("ingresa usuario")
            .located(By.id("loginusername"));

    public static final Target INPUT_PASSWORD = Target.the("ingresa password")
            .located(By.id("loginpassword"));

    public static final Target BUTTON_LOGIN = Target.the("pulsa el boton entrar")
            .located(By.className("btn btn-primary"));

}