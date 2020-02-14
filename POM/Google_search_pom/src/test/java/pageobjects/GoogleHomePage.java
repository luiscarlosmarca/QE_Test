package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import utils.WebFactory;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static utils.Constants.PAGE_HOME_GOOGLE;

@DefaultUrl(PAGE_HOME_GOOGLE)
public class GoogleHomePage extends WebFactory {


    @FindBy(xpath = "//input[@name='q']")
    public WebElementFacade TXT_BOX_SEARCH;

    @FindBy(xpath = "//div[@class='FPdoLc tfB0Bf']//input[@value='Buscar con Google']")
    public WebElementFacade BTN_SEARCH;

    @FindBy(xpath = "//div[@id='resultStats'][contains(text(),'Cerca')]")
    public WebElementFacade LBL_RESULTS;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3")
    public WebElementFacade FIRST_RESULT;

    public GoogleHomePage(WebDriver webdriver) {
        super(webdriver);
    }

    public void type_words(String words){
        type(words,TXT_BOX_SEARCH);
    }
    public void search(){
        click(BTN_SEARCH);
    }

    public void seeResults(){
        assertThat(LBL_RESULTS.isCurrentlyVisible(),is(true));
    }
    public void seeAResult(String result){
        assertThat(getText(FIRST_RESULT).contentEquals(result),is(true));
        FIRST_RESULT.click();
    }




}
