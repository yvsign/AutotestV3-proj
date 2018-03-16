package loginTests;

import libs.ConfigData;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;

public class ValidLoginWithParamFromExcel extends ParentTest {

    public ValidLoginWithParamFromExcel(String browser){
        super(browser);
    }

    @Test
    public void validLogin() throws IOException{
        Map dataFromExcelForValidLoginTest = excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"), "validLogOn");
        loginPage.openPage();
        loginPage.inputLoginName(dataFromExcelForValidLoginTest.get("login").toString());
        loginPage.inputPass(dataFromExcelForValidLoginTest.get("pass").toString());
        loginPage.clickSubmitButton();
    }
}
