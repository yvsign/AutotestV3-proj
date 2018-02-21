package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sign on 2/18/2018.
 */
public class HomePage {
    WebDriver driver;
    Logger log;
    String titleLogoXpath = "//a[@ class='logo']";

    public HomePage(WebDriver driver){
        this.driver = driver;
        log = Logger.getLogger(getClass());

    }

}
