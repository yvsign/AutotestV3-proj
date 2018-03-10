package CreatingEntities;

import loginTests.ValidLogin;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.SlovariApparat;
import parentTest.ParentTest;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class CreateApparat extends ParentTest {

    public CreateApparat(String browser) {
        super(browser);
    }

    @Test
    public void createApparat() {
        try {
            loginPage.loginUser("Student", "909090");
            slovariApparat.openSlovariApparat();
            log.info("Slovari was chosen");
            slovariApparat.createApparat("121", "Stupitsa");
        } catch (Exception ex) {
            log.error("Error" + ex);
        }

    }
}
