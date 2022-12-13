package automatizado.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTeste {
    
    protected static WebDriver driver;
   // private static final String URL_BASE_GOOGLE = "https://www.google.com/";
    /**
     * @param URL_BASE endereço-da-página-login-na-minha-maquina.
     */
    private static final String URL_BASE = "C:/Users/leona/OneDrive/Documentos/leonardo/estudos/udemy/Testes Automatizados- Curso completo Java Selenium/materiais complementares/controle-de-produtos/sistema/login.html";
    private static  final String CAMINHO_DRIVER = "src/test/java/automatizado/resource/chromedriver.exe";

    @BeforeClass
    public static void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @AfterClass
    public static void finalizar(){
        driver.quit();
    }
}
