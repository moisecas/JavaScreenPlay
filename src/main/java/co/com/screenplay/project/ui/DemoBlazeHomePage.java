package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoBlazeHomePage {
    public static final Target CATEGORY_LAPTOPS = Target.the("Categoría Laptops")
            .located(By.xpath("//a[text()='Laptops']"));
    public static final Target LIST_LAPTOPS = Target.the("Lista de productos")
            .located(By.xpath("//a[normalize-space()='Sony vaio i5']"));
}
