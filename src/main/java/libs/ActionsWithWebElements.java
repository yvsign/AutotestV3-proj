package libs;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsWithWebElements {
    WebDriver driver;
    Logger log;
    WebDriverWait webDriverWait;

    public ActionsWithWebElements(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        webDriverWait = new WebDriverWait(driver, 20);

    }

    /**
     * This method input text value in text field
     * @param element
     * @param value
     */
    public void inputToTextField(WebElement element, String value) {
        try {
            element.clear();
            element.sendKeys(value);
            log.info(value + "  is inputed to " + element);
        } catch (Exception ex) {
            log.error("Data wasn't inputed " + ex);
        }
    }

    /**
     * This method click to web element
     * @param element
     */
    public void clickMethod(WebElement element)
    {
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    /**
     * this method check is element present & enabled
     * @param element
     * @return
     */
    public boolean IsElementPresent(WebElement element)
    {
       return element.isDisplayed() && element.isEnabled();
    }

    /**
     * Method select visible text from DDL
     * @param elementDD
     * @param textForSelect
     */
    public void selectItemFromDropDownByVisibleTex(WebElement elementDD, String textForSelect){

        try{
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByVisibleText(textForSelect);
            log.info(textForSelect + "was selected in DD");
        }
        catch (Exception e){
            log.error("Cannotwork with elements");
            Assert.fail("Cannot work with elements");
        }
    }

    public void selectItemFromDropDownByValue(WebElement elementDD, String valueInDD){

        try{
            Select optionsFromDD = new Select(elementDD);
            optionsFromDD.selectByValue(valueInDD);
            log.info(valueInDD + "was selected in DD");
        }
        catch (Exception e){
            log.error("Cannotwork with elements");
            Assert.fail("Cannot work with elements");
        }
    }

    public void SelectCheckbox(WebElement element, boolean neededState)
    {
        try
        {
            if((element.isSelected() && !neededState) || (!element.isSelected())&& neededState)
            {
                element.click();
            }

        }
        catch (Exception e)
        {
            log.error("Error" + e);
        }

    }


}
