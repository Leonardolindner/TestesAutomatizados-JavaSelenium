package automatizado.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import automatizado.page.GooglePO;

public class GoogleTeste extends BaseTeste {

    private static GooglePO googlePage;
    @BeforeClass
    public static void preparaTestes(){
       googlePage = new GooglePO(driver); 
    }
    
    @Test
    public void TC001_devePesquisarNoGoogleOTextoBatataFrita(){
        
        googlePage.pesquisar("batata frita");
        
        String resultado = googlePage.obterResultadoDaPesquisa();

        assertTrue(resultado, resultado.contains("Aproximadamente"));
        
        
    }

    @Test
    public void TC002_devePesquisarNoGoogleOTextoNutella(){
        
        googlePage.pesquisar("nutella");
        
        String resultado = googlePage.obterResultadoDaPesquisa();

        assertTrue(resultado, resultado.contains("resultados"));
        
        
    }
}
