package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import static utils.Constants.PAGE_HOME_GOOGLE;

@DefaultUrl(PAGE_HOME_GOOGLE)
public class GoogleHomePage extends PageObject {


    @FindBy(xpath = "//input[@name='q']")
    public WebElementFacade TXT_BOX_SEARCH;

    @FindBy(xpath = "//div[@class='FPdoLc tfB0Bf']//input[@value='Buscar con Google']")
    public WebElementFacade BTN_SEARCH;

    @FindBy(xpath = "//div[@class='FPdoLc tfB0Bf']//input[@value='Buscar con Google']")
    public WebElementFacade LBL_RESULTS;

    //div[@id='resultStats'][contains(text(),'Cerca')]
    public void type_words(String words){
        TXT_BOX_SEARCH.sendKeys(words);
    }

    public void search(){
        BTN_SEARCH.click();
    }



}
