package pages;


import libs.ActionsWithWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {
    WebDriver driver;
    Logger log;
    ActionsWithWebElements actionsWithWebElements;

    By loginNameInputName = By.name("_username");
    String getLoginNameInputXpath = "//*[@name='_username']";

    String passInputId = "password";
    String passInputXpath = ".//*[@id='password']";

    String buttonSubmitType = "submit";
    String buttonSubmitXpath = "//*[@type='submit']";

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        actionsWithWebElements = new ActionsWithWebElements(driver);
    }

    public void OpenPage(String link)
    {
        try {
            driver.get(link);
            log.info("Page is opened");
        }
        catch (Exception ex){
            log.error("Page was not opened" + ex);
        }
    }
    public void InputLoginName(String login)
    {
       actionsWithWebElements.InputToTextField(loginNameInputName, login);
    }
    public void InputPass(String pass)
    {
        try {
            driver.findElement(By.id(passInputId)).clear();
            driver.findElement(By.id(passInputId)).sendKeys(pass);
        }
        catch (Exception ex){
            log.error("Error while pass" + ex);
        }
    }
    public void ClickSubmitButton()
    {
        try {
            driver.findElement(By.xpath(buttonSubmitXpath)).click();
            log.info("Clicked =)");
        } catch (Exception e) {
            log.error("was not clicked" + e);
        }
    }


}
