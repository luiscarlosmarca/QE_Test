package steps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import pageobjects.GoogleHomePage;

public class SearchGoogleSteps {
    @Managed(driver = "chrome", uniqueSession = true)
    WebDriver driver;

    GoogleHomePage googlehomepage;
    @Step
    public void search(){
        googlehomepage.search();
    }
    @Step
    public void into_page(){
        googlehomepage.open();
    }

    @Step
    public void type_the(String words){
        googlehomepage.type_words(words);
    }

    @Step
    public void verify_page(){
        googlehomepage.result();
    }

}
