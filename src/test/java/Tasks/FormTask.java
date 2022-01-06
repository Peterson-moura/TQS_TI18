package Tasks;

import Framework.Browser.Waits;
import Pages.FormularioPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class FormTask {


    private WebDriver driver;

    private FormularioPage formularioPage;

    private Waits waits;

    public FormTask(WebDriver driver){

        this.driver = driver;
        formularioPage = new FormularioPage(this.driver);
        waits = new Waits(this.driver);
    }

    public  void preencherForm(){
        formularioPage.getName().sendKeys("Joao");
        formularioPage.getLastName().sendKeys("Silva");
        formularioPage.getEmail().sendKeys("test@teste.com");
        formularioPage.getAddress().sendKeys("salvador");
        formularioPage.getUniversit().sendKeys("PUCRS");
        waits.loadElement(formularioPage.getProfile());
        formularioPage.getProfile().sendKeys("pobre");
        formularioPage.getGender().sendKeys("M");
        formularioPage.getAge().sendKeys("26");
        formularioPage.getEnviarButton().click();
        validarCriacaoUsuario();
    }

    private  void validarCriacaoUsuario(){
        String text = formularioPage.getMensagemTitle().getText();

        Assertions.assertEquals("Usuario Criado com sucesso",text);
    }
}
