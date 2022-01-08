package Framework.Utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class FakerGenerations {

    private Faker faker;

    private String firstName;
    private String lastName;
    private String email;
    private String university;
    private String profession;
    private String genre;
    private String age;
    private String address;

    public FakerGenerations(WebDriver driver){
        faker = new Faker(new Locale("pt-BR"));

    }

    public String getFirstName() {
        return  faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getEmail() {
        return faker.internet().emailAddress();
    }

    public String getUniversity() {
        return faker.university().name();
    }

    public String getProfession() {
        return faker.job().title();
    }

    public String getGenre() {
        return faker.demographic().sex();
    }

    public String getAge() {
        return faker.number().digit();
    }

    public String getAddress() {
        return faker.address().streetAddress();
    }
}
