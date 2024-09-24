package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TalanaHomePage {
    public static final Target LOGIN_BUTTON = Target.the("Login button")
            .located(By.xpath("//a[@class='talana-btn talana-light talana-text-color-black login-btn']"));

    public static final Target USERNAME_FIELD = Target.the("Username field")
            .located(By.xpath("//input[@aria-label='Usuario, Email o N° Documento']"));

}
