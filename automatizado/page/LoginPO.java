package automatizado.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO{

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "senha")
    public WebElement inputSenha;

    @FindBy(id = "btn-entrar")
    public WebElement buttonEntrar;

    @FindBy(css = "form.form-login>div.alert>span")
    public WebElement spanMensagem;

    /**
     * contrutor-padrão-para-criação-de-uma-nova-instancia-da-página-de-login;
     * @param driver Driver-da-pagina-de-login.
     */
    public LoginPO(WebDriver driver) {
        super(driver);   
    }

    public void escrever( WebElement input, String texto){
        input.clear();
        input.sendKeys(texto);
    }
    
    public String obterMensagem(){
        return spanMensagem.getText();
    }

    /**
     * Método-que-tenta-executar-a-ação-de-logar-no-sistema.
     * @param email - Email-para-a-tentativa-de-login.
     * @param Senha -Senha-para-a-tentativa-de-login.
     */
    public void executarAcaoDeLogar(String email, String Senha){
        escrever(inputEmail, email);
        escrever(inputSenha, Senha);
        buttonEntrar.click();
    }

    public String obterTituloDaPagina(){
        return driver.getTitle();
    }
}
