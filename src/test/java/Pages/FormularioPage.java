package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormularioPage {

    private WebDriver driver;

    public FormularioPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getName(){
        return  driver.findElement(By.xpath("//div[@class='row']/div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_name']"));
    }

    public  WebElement getLastName(){
        return  driver.findElement(By.xpath("//div[@class='row']/div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_lastname']"));
    }

    public  WebElement getEmail(){
        return  driver.findElement(By.xpath("//div[@class='row']/div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_email']"));
    }

    public  WebElement getAddress(){
        return  driver.findElement(By.xpath("//div[@class='row']/div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_address']"));
    }

    public  WebElement getUniversit(){
        return  driver.findElement(By.xpath("//div[@class='row']/div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_universit']"));
    }

    public  WebElement getProfile(){
        return  driver.findElement(By.xpath("//div[@class='row']/div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_profile']"));
    }

    public  WebElement getGender(){
        return  driver.findElement(By.xpath("//div[@class='row']/div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_gender']"));
    }

    public  WebElement getAge(){
        return  driver.findElement(By.xpath("//div[@class='row']/div[@class='col s9']/div[@class='row']/div[@class='col s8 center']/form[@id='new_user']/div[@class='row']/div[@class='col s6']/div[@class='input-field']/input[@id='user_age']"));
    }

    public WebElement getMensagemTitle(){

        return this.driver.findElement(By.id("notice"));
    }





}
