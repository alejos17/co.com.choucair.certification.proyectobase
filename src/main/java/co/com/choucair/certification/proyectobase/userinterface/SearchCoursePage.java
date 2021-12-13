package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target SEARCH_BUTTON = Target.the("button to show input search").located(By.xpath("//i[contains(@class,'icon fa fa-search fa-fw')]"));

    public static final Target INPUT_SEARCH = Target.the("where do we write the keyword to search").located(By.xpath("//input[@class='form-control']"));

    public static final Target SELECT_COURSE = Target.the("Click Course to into").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));

    public static final Target NAME_COURSE = Target.the("Nombre del Curso").located(By.xpath("//h3[@class='coursename'][contains(text(),'Metodología Bancolombia')]"));
}
