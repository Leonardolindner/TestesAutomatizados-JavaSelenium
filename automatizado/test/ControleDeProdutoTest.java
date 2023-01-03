package automatizado.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizado.page.ControleProdutoPO;
import automatizado.page.LoginPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ControleDeProdutoTest extends BaseTeste{

    private static LoginPO loginPage;
    private static ControleProdutoPO controleProdutoPage;

    @BeforeClass
    public static void prepararTestes(){
        loginPage = new LoginPO(driver);
        loginPage.executarAcaoDeLogar("admin@admin.com", "admin@123");
        
        controleProdutoPage = new ControleProdutoPO(driver);

        assertEquals(controleProdutoPage.obterTituloDaPagina(), "Controle de Produtos"); 
    }
    
    @Test
    public void TC001_deveAbrirModalParaCadastroAoClicarNoBotaoCriar(){
        controleProdutoPage.buttonAdicionar.click();
        controleProdutoPage.buttonAdicionar.click();
        
        String titulo = controleProdutoPage.tituloModal.getText();
        assertEquals( "Produto", titulo); 
    }
    
}
