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


    By loginNameInputName = By.name("_username");
    String getLoginNameInputXpath = "//*[@name='_username']";

    By passInputId = By.id("password");
    String passInputXpath = ".//*[@id='password']";

    By buttonSubmitType = By.xpath("//*[@type='submit']");
    String buttonSubmitXpath = "//*[@type='submit']";

    @FindBy(name = "_username")
    WebElement InputLoginElement;
    @FindBy(id = "password")
    WebElement InputPassElement;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement SubmitButton;

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public void OpenPage() {
        try {
            driver.get(ConfigData.getCfgValue("base_url")+"/login");
            log.info("Page is opened");
        } catch (Exception ex) {
            log.error("Page was not opened" + ex);
            Assert.fail("Can not open URL");
        }
    }

    public void inputLoginName(String login) {
        actionsWithWebElements.inputToTextField(InputLoginElement, login);
    }

    public void InputPass(String pass) {
        try {
            actionsWithWebElements.inputToTextField(InputPassElement, pass);
        } catch (Exception ex) {
            log.error("Error while pass" + ex);
        }
    }

    public void clickSubmitButton() {
        actionsWithWebElements.clickMethod(SubmitButton);

    }

    public void LoginUser(String login, String password) {
        OpenPage();
        inputLoginName(login);
        InputPass(password);
        clickSubmitButton();

    }

}



