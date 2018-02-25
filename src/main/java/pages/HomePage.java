package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends ParentPage {

    String titleLogoXpath = "//a[@ class='logo']";

    public HomePage(WebDriver driver){

        super(driver);

    }
    @FindBy(xpath = "//div[@class='pull-left image']")
    WebElement avatar;
    @FindBy(xpath = "//ul[@class = 'sidebar-menu']//span[text() = 'Словари']")
    WebElement menuDictionary;
    @FindBy(xpath = "//a[@href='/dictionary/apparat']" )
    WebElement subMenuApparat;

    public boolean isAvatarPresent() {
        return actionsWithWebElements.IsElementPresent(avatar);
    }

    public void clickOnMenuDictionary() {
        actionsWithWebElements.ClickMethod(menuDictionary);
    }

    public void clickOnSubMenuApparat() {
        actionsWithWebElements.ClickMethod(subMenuApparat);
    }

}
