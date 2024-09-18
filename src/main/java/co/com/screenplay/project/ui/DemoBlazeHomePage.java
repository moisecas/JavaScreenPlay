package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoBlazeHomePage {
    public static final Target CATEGORY_LAPTOPS = Target.the("Categoría Laptops")
            .located(By.xpath("//a[text()='Laptops']"));
    public static final Target CATEGORY_PHONES = Target.the("Lista de productos")
            .located(By.xpath("//div[@id='contcont']//a[2]"));
}
