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
    By addApparatButtonXpath = By.xpath("//i[@class='fa fa-plus'");
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
        actionsWithWebElements.ClickMethod(slovariMenuXpath);
        actionsWithWebElements.ClickMethod(apparatMenuSlovariXpath);
    }
    public  void CreateApparat()
    {
        actionsWithWebElements.ClickMethod(addApparatButtonXpath);
        actionsWithWebElements.InputToTextField(apparatNumberFieldXpath, "121");
        actionsWithWebElements.InputToTextField(apparatCommentXpath,"Stupitsa");
        actionsWithWebElements.ClickMethod(submitButtonCreate);
    }
}
