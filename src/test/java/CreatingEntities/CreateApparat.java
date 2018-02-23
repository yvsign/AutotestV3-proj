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

import java.io.File;
import java.util.concurrent.TimeUnit;


public class CreateApparat {
    WebDriver driver;
    Logger log;
    SlovariApparat slovariApparat;
    LoginPage loginPage;
    ValidLogin validLogin;


    @Before

    public void setUp()
    {
        File fileFF = new File("./drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        slovariApparat = new SlovariApparat(driver);
        loginPage = new LoginPage(driver);
        validLogin = new ValidLogin();

    }
    @Test
    public void CreateApparat() {
        try {
            loginPage.OpenPage("http://v3.qalight.com.ua/login");
            loginPage.InputLoginName("Student");
            loginPage.InputPass("909090");
            loginPage.ClickSubmitButton();
            slovariApparat.OpenSlovariApparat();
            slovariApparat.CreateApparat();
        }
        catch (Exception ex)
        {
            log.error("Error" + ex);
        }

    }
    @After

    public void TearDown()
    {
        driver.quit();
    }
}
