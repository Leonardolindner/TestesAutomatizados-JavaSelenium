package automatizado.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import automatizado.page.LoginPO;

public class LoginTest extends BaseTeste {
    

    private static LoginPO loginPage;

  
    @BeforeClass
    public static void prepararTestes(){
        loginPage = new LoginPO(driver);
    }

    @Test
    public void TC001_naoDeveLogarNoSistemaComEmailESenhaVazios(){
        loginPage.inputSenha.sendKeys("");
        loginPage.escrever(loginPage.inputEmail, "");
        loginPage.escrever(loginPage.inputSenha, "");
        loginPage.buttonEntrar.click();

        String mensagem =  loginPage.obterMensagem();
         
        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
    }

}
