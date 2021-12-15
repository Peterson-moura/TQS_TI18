package Framework;

import Framework.Browser.DriverManager;
import Framework.Browser.TypeDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest extends DriverManager {

    private String url = ("https://automacaocombatista.herokuapp.com");

    private static WebDriver driver;

    public WebDriver getDriver(){
        return driver = getDriver(TypeDriver.CHROME);
    }

    @BeforeEach
    public void setUp(){
        getDriver().get(url);
    }

    @AfterEach
    public void tearDown(){
        quitDriver();
    }


}
