package co.com.screenplay.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoBlazeHomePage {
    public static final Target CATEGORY_LAPTOPS = Target.the("Laptops category")
            .locatedBy("//a[3]");

    public static final Target PRODUCT_SONY_VAIO = Target.the("Sony vaio i5")
            .locatedBy("//a[normalize-space()='Sony vaio i5']");
}
