package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.GoogleHomePage;

public class SearchGoogleSteps {

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
        googlehomepage.seeResults();
    }

    @Step
    public void verify_result(String result){
        googlehomepage.seeAResult(result);
    }

}
