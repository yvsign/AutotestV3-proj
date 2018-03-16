package CreatingEntities;

import libs.ConfigData;
import org.junit.BeforeClass;
import org.junit.Test;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;


public class InstallApparat extends ParentTest {
    public InstallApparat(String browser) {
        super(browser);
    }

    /*@BeforeClass
    public void validLogin() throws IOException {
        Map dataFromExcelForValidLoginTest = excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"), "validLogOn");
        loginPage.openPage();
        loginPage.inputLoginName(dataFromExcelForValidLoginTest.get("login").toString());
        loginPage.inputPass(dataFromExcelForValidLoginTest.get("pass").toString());
        loginPage.clickSubmitButton();*/

    @Test
        public void installApparat () {
            loginPage.loginUser("Student", "909090");
            log.info("login success");
            installPage.openInstallPage();
            log.info("Install page was opened");

            installPage.setDate();
            log.info("date was chosen");
            installPage.setTime();
        log.info("time was chosen");
            installPage.chooseApparatToInstall();
        log.info("apparat was chosen");
            installPage.chooseWorkerToInstall();
        log.info("worker was chosen & submitted");

        }

}
