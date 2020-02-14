package utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebFactory extends PageObject {

    private WebDriver webdriver;

    public WebFactory(WebDriver webdriver) {
        this.webdriver = webdriver;
    }

    public WebDriver chromeDriver(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/driver/chromedriver");
        webdriver =  new ChromeDriver();
        return  webdriver;


    }

    public WebElement findElement( By locator){
        return webdriver.findElement(locator);

    }

    public String getText(WebElement element){
         return element.getText();
    }

    public String getText(By locator){
        return webdriver.findElement(locator).getText();
    }

    public void type(String text, WebElementFacade locator){
        locator.sendKeys(text);

    }

    public void click(WebElementFacade locator){
        locator.click();
    }

    public Boolean isDisplayed(By locator){
        try{
            return webdriver.findElement(locator).isDisplayed();

        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;

        }
    }

    public void visit(String url){
        webdriver.get(url);
    }


}
