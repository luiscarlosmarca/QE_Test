package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.GoogleHomePage;

public class googleSearchSteps {

    GoogleHomePage googlehomepage;

    @Step
    public void into_page(){
        googlehomepage.open();
    }

    @Step
    public void search_in_google(String words){

        googlehomepage.doSearch(words);

    }


}
