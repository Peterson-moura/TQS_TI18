package Tasks;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import Framework.Utils.FakerGenerations;
import Pages.FormularioPage;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class FormTask {


    private WebDriver driver;
    private FormularioPage formularioPage;
    private Waits waits;
    private FakerGenerations fakerGenerations;

    public FormTask(WebDriver driver){

        this.driver = driver;
        formularioPage = new FormularioPage(this.driver);
        waits = new Waits(this.driver);
        fakerGenerations = new FakerGenerations(this.driver);
    }

    public  void preencherForm(){
        formularioPage.getName().sendKeys(fakerGenerations.getFirstName());
        formularioPage.getLastName().sendKeys(fakerGenerations.getLastName());
        formularioPage.getEmail().sendKeys(fakerGenerations.getEmail());
        formularioPage.getAddress().sendKeys(fakerGenerations.getAddress());
        formularioPage.getUniversit().sendKeys(fakerGenerations.getUniversity());
        waits.loadElement(formularioPage.getProfile());
        formularioPage.getProfile().sendKeys(fakerGenerations.getProfession());
        formularioPage.getGender().sendKeys(fakerGenerations.getGenre());
        formularioPage.getAge().sendKeys(fakerGenerations.getAge());
        formularioPage.getEnviarButton().click();
        validarCriacaoUsuario();
    }

    private  void validarCriacaoUsuario(){
        try{
            String text = formularioPage.getMensagemTitle().getText();
            Assertions.assertEquals("Usuário Criado com sucesso",text);
            Report.extentTest.log(Status.PASS, "USUARIO CADASTRADO COM SUCESSO", Screenshot.capture(driver));

        }catch (Exception e){
            Report.extentTest.log(Status.FAIL, "NÃO FOI POSSIVEL CADASTRAR O USUARIO",Screenshot.capture(driver));
        }
    }
}
