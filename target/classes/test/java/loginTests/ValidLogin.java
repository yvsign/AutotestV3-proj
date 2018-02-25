package loginTests;

import com.google.common.annotations.VisibleForTesting;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SlovariApparat;
import parentTest.ParentTest;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class ValidLogin extends  ParentTest {


    public ValidLogin(String browser) {
        super(browser);

    }

    @Test
    public void ValidLogin()
    {
       loginPage.OpenPage();
       loginPage.inputLoginName("Student");
       loginPage.InputPass("909090");
       loginPage.clickSubmitButton();
       checkAcceptanceCriteria("Avatar is not present", homePage.isAvatarPresent(), true);
       checkAcceptanceCriteria("Title is not expected", homePage.getTitle(), "Учет запчастей" );


    }

}
