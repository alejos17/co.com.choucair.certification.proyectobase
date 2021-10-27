package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target SEARCH_BUTTON = Target.the("button to show input search").located(By.xpath("//i[contains(@class,'icon fa fa-search fa-fw')]"));

    public static final Target INPUT_SEARCH = Target.the("where do we write the keyword to search").located(By.xpath("//input[@class='form-control']"));

    public static final Target SELECT_COURSE = Target.the("Click Course to into").located(By.xpath("//div[@class='result-content'][contains(text(),'Guías Técnicas - Analista Financial')]"));

}
