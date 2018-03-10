package pages;


import libs.ActionsWithWebElements;
import libs.ConfigData;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


    public class LoginPage extends ParentPage {



/*
    By loginNameInputName = By.name("_username");
    String getLoginNameInputXpath = "//*[@name='_username']";

    By passInputId = By.id("password");
    String passInputXpath = ".//*[@id='password']";

    By buttonSubmitType = By.xpath("//*[@type='submit']");
    String buttonSubmitXpath = "//*[@type='submit']";*/

    @FindBy(xpath = "//*[@name='_username']")
     WebElement inputLoginElement;
    @FindBy(xpath = "//*[@id='password']")
     WebElement inputPassElement;
    @FindBy(xpath = "//button[@type='submit']")
     WebElement submitButtonElement;

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public void openPage() {
        try {
            driver.get(ConfigData.getCfgValue("base_url")+"/login");
            log.info("Page is opened");
        } catch (Exception ex) {
            log.error("Page was not opened" + ex);
            Assert.fail("Can not open URL");
        }
    }

    public void inputLoginName(String login)
    {

        actionsWithWebElements.inputToTextField(inputLoginElement, login);


    }

    public void inputPass(String pass) {

            actionsWithWebElements.inputToTextField(inputPassElement, pass);

    }

    public void clickSubmitButton() {
       actionsWithWebElements.clickMethod(submitButtonElement);

    }

    public void loginUser(String login, String password) {
        openPage();
        inputLoginName(login);
        inputPass(password);
        clickSubmitButton();

    }

}



