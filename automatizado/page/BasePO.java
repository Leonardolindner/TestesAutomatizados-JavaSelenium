package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*
 * Classe-base-para-a-criação-das-novas-PagesObjects.
 * Todas-as-Pages-devem-ser-herdadas-desta-classe.
 */
public abstract class BasePO {

    /*Drive-base-que-será-usado-pelas-pages- */
    public WebDriver driver;

    /*
     * Contrutor-base-para-criação-da-fabrica-de-elementos(pageFactory).
     * @param driver --Driver-da-pagin-atual.
     */
    protected BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    
}
