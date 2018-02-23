package pages;

import libs.ActionsWithWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SlovariApparat {
    WebDriver driver;
    Logger log;
    ActionsWithWebElements actionsWithWebElements;

    By slovariMenuXpath = By.xpath("//ul[@class = 'sidebar-menu']//span[text() = 'Словари']");
    By apparatMenuSlovariXpath = By.xpath("//a[@href='/dictionary/apparat']");
    By addApparatButtonXpath = By.xpath("//i[@class='fa fa-plus']");
    By apparatNumberFieldXpath = By.xpath("//input[@id='apparat_apparatNumber']");
    By apparatCommentXpath = By.xpath("//input[@id='apparat_apparatComment']");
    By submitButtonCreate = By.xpath("//div[@class = 'box-footer']/button[@type='submit']");

    public SlovariApparat(WebDriver driver)
    {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        actionsWithWebElements = new ActionsWithWebElements(driver);
    }

    public void  OpenSlovariApparat()
    {
        try {

            actionsWithWebElements.ClickMethod(slovariMenuXpath);
            log.info("Slovari opened");
            actionsWithWebElements.ClickMethod(apparatMenuSlovariXpath);
            log.info("Apparat opened");
        }
        catch (Exception ex){
            log.error("Error" + ex);
        }
    }
    public  void CreateApparat()
    {
        try {

            actionsWithWebElements.ClickMethod(addApparatButtonXpath);
            log.info("Add push");
            actionsWithWebElements.InputToTextField(apparatNumberFieldXpath, "121");
            log.info("Number inputted");
            actionsWithWebElements.InputToTextField(apparatCommentXpath, "Stupitsa");
            log.info("Name inputted");
            actionsWithWebElements.ClickMethod(submitButtonCreate);
            log.info("Submit clicked");
        }
        catch (Exception ex)
        {
            log.error("Error" + ex);
        }
    }
}
