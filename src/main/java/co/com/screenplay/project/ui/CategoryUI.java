package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CategoryUI extends PageObject {

    // Categorías en la página de Demoblaze
    public static final Target CATEGORY_PHONES = Target.the("Categoría Phones")
            .located(By.xpath("//a[text()='Phones']"));

    public static final Target CATEGORY_LAPTOPS = Target.the("Categoría Laptops")
            .located(By.xpath("//a[text()='Laptops']"));

    public static final Target CATEGORY_MONITORS = Target.the("Categoría Monitors")
            .located(By.xpath("//a[text()='Monitors']"));

    //metodo para la lista de los productos

    public static  List<WebElement> getLocatorListProducts(){
        return locatorListProducts();
    }

    private static List<WebElement> locatorListProducts() {
        String xpath = "//div[@id='tbodyid']//h4/a[@class='hrefch']";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }



}