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
    WebElement slovariMenuElement;
    //By apparatMenuSlovariXpath = By.xpath("//a[@href='/dictionary/apparat']");
    @FindBy (xpath = "//a[@href='/dictionary/apparat']")
    WebElement apparatMenuSlovariElement;
    //By addApparatButtonXpath = By.xpath("//i[@class='fa fa-plus']");
    @FindBy (xpath = "//i[@class='fa fa-plus']")
    WebElement addApparatButtonElement;
   // By apparatNumberFieldXpath = By.xpath("//input[@id='apparat_apparatNumber']");
    @FindBy (xpath = "//input[@id='apparat_apparatNumber']")
    WebElement apparatNumberFieldElement;
    //By apparatCommentXpath = By.xpath("//input[@id='apparat_apparatComment']");
    @FindBy (xpath = "//input[@id='apparat_apparatComment']")
    WebElement apparatCommentElement;
    //By submitButtonCreate = By.xpath("//div[@class = 'box-footer']/button[@type='submit']");
    @FindBy (xpath = "//div[@class = 'box-footer']/button[@type='submit']")
    WebElement submitButtonCreate;

    public SlovariApparat(WebDriver driver)
    {
        super(driver);
    }

    public void  openSlovariApparat()
    {

            actionsWithWebElements.clickMethod(slovariMenuElement);
            actionsWithWebElements.clickMethod(apparatMenuSlovariElement);


    }
    public  void createApparat(String number, String name)
    {


        actionsWithWebElements.clickMethod(addApparatButtonElement);
        actionsWithWebElements.inputToTextField(apparatNumberFieldElement, number);
        actionsWithWebElements.inputToTextField(apparatCommentElement, name);
        actionsWithWebElements.clickMethod(submitButtonCreate);


    }
}
