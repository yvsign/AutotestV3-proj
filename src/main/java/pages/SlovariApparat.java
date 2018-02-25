package pages;

import libs.ActionsWithWebElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SlovariApparat extends ParentPage {


    //By slovariMenuXpath = By.xpath("//ul[@class = 'sidebar-menu']//span[text() = 'Словари']");
    @FindBy (xpath = "//ul[@class = 'sidebar-menu']//span[text() = 'Словари']")
    WebElement slovariMenuXpath;
    //By apparatMenuSlovariXpath = By.xpath("//a[@href='/dictionary/apparat']");
    @FindBy (xpath = "//a[@href='/dictionary/apparat']")
    WebElement apparatMenuSlovariXpath;
    //By addApparatButtonXpath = By.xpath("//i[@class='fa fa-plus']");
    @FindBy (xpath = "//i[@class='fa fa-plus']")
    WebElement addApparatButtonXpath;
    //By apparatNumberFieldXpath = By.xpath("//input[@id='apparat_apparatNumber']");
    @FindBy (xpath = "//input[@id='apparat_apparatNumber']")
    WebElement apparatNumberFieldXpath;
   // By apparatCommentXpath = By.xpath("//input[@id='apparat_apparatComment']");
    @FindBy (xpath = "//input[@id='apparat_apparatComment']")
    WebElement apparatCommentXpath;
    //By submitButtonCreate = By.xpath("//div[@class = 'box-footer']/button[@type='submit']");
    @FindBy (xpath = "//div[@class = 'box-footer']/button[@type='submit']")
    WebElement submitButtonCreate;

    public SlovariApparat(WebDriver driver)
    {
        super(driver);
    }

    public void  OpenSlovariApparat()
    {
        try {

            actionsWithWebElements.clickMethod(slovariMenuXpath);
            log.info("Slovari opened");
            actionsWithWebElements.clickMethod(apparatMenuSlovariXpath);
            log.info("Apparat opened");
        }
        catch (Exception ex){
            log.error("Error" + ex);
        }
    }
    public  void CreateApparat()
    {
        try {

            actionsWithWebElements.clickMethod(addApparatButtonXpath);
            log.info("Add push");
            actionsWithWebElements.inputToTextField(apparatNumberFieldXpath, "121");
            log.info("Number inputted");
            actionsWithWebElements.inputToTextField(apparatCommentXpath, "Stupitsa");
            log.info("Name inputted");
            actionsWithWebElements.clickMethod(submitButtonCreate);
            log.info("Submit clicked");
        }
        catch (Exception ex)
        {
            log.error("Error" + ex);
        }
    }
}
