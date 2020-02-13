package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
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
    public void doSearch(String words){
        TXT_BOX_SEARCH.sendKeys(words);
        BTN_SEARCH.click();
    }




}
