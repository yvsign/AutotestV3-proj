package libs;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ActionsWithWebElements {
    WebDriver driver;
    Logger log;

    public ActionsWithWebElements(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
    }

    /**
     * This method input text value in text field
     * @param element
     * @param value
     */
    public void InputToTextField(WebElement element, String value) {
        try {
            element.clear();
            element.sendKeys(value);
            log.info(value + "  is inputed to " + element);
        } catch (Exception ex) {
            log.error("Login doesn't input " + ex);
        }
    }

    /**
     * This method click to web element
     * @param button
     */
    public void ClickMethod(WebElement button) {
        button.click();
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
